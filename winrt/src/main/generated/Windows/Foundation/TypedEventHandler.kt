package Windows.Foundation

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.DynamicSignature
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.NativeFunctionMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.Delegate
import com.github.knk190001.winrtbinding.runtime.base.IParameterizedABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.iUnknownIID
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.ISpecializable
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.interop.runtimeFromNativeJF
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toFunctionDescriptor
import com.github.knk190001.winrtbinding.runtime.transformParameterizedHandle
import com.sun.jna.Function
import com.sun.jna.Memory
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.WinNT
import java.lang.foreign.Linker
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySession
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Any
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmStatic
import kotlin.reflect.KType
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

public fun interface TypedEventHandlerBody<TSender, TResult> {
  public operator fun invoke(sender: TSender?, args: TResult?): Unit
}

@ABIMarker(TypedEventHandler.ABI::class)
@GenericType
@DynamicSignature
@Guid("9de1c5346ae111e084e118a905bcc53f")
@WinRTByReference(TypedEventHandler.ByReference::class)
public class TypedEventHandler<TSender, TResult>(
  public val type: KType? = null,
  public val body: TypedEventHandlerBody<TSender, TResult>? = null,
  ptr: Pointer? = Pointer.NULL
) : Delegate() {
  public operator fun invoke(sender: TSender, args: TResult): Unit {
    body!!(sender, args)
  }

  public companion object {
    public val nativeFnHandle: MethodHandle
      @NativeFunctionMarker
      get() = MethodHandles.lookup().findStatic( TypedEventHandler::class.java, "nativeFn",
        MethodType.methodType(Int::class.java, 
        KType::class.java, TypedEventHandlerBody::class.java, MemoryAddress::class.java,
            Any::class.java, Any::class.java, )

      )

    public inline operator fun <reified TSender, reified TResult>
        invoke(fn: TypedEventHandlerBody<TSender, TResult>): TypedEventHandler<TSender, TResult> {
      val session = MemorySession.global()
      val handleDescriptorPair = transformParameterizedHandle(typeOf<TypedEventHandler<TSender,
          TResult>>())
      val methodHandle = handleDescriptorPair.first.bindTo(fn)
      val functionDescriptor = handleDescriptorPair.second
      val stub = Linker.nativeLinker().upcallStub(methodHandle, functionDescriptor, session)
      val newDelegate = TypedEventHandler(typeOf<TypedEventHandler<TSender, TResult>>(), fn,
          Memory(12))
      val guid = guidOf<TypedEventHandler<TSender, TResult>>()
      newDelegate.init(listOf(IUnknown.ABI.IID, guid), Pointer(stub.address().toRawLongValue()))
      return newDelegate
    }

    public operator fun <TSender, TResult> invoke(type: KType, ptr: Pointer?):
        TypedEventHandler<TSender, TResult> {
      val thisPtr = ptr!!.getPointer(0)
      val vtbl = thisPtr!!.getPointer(0)
      val function = Function.getFunction(vtbl.getPointer(3L * Native.POINTER_SIZE))
      val body: TypedEventHandlerBody<TSender, TResult> = TypedEventHandlerBody<TSender, TResult>  {
        sender, args ->
        val hr = function.invokeHR(arrayOf(thisPtr, marshalToNative(sender,
            type!!.arguments[0].type!!), marshalToNative(args, type!!.arguments[1].type!!)))
        checkHR(hr)
      }
      return TypedEventHandler(type, body, thisPtr)
    }

    public inline operator fun <reified TSender, reified TResult> invoke(pointer: Pointer?):
        TypedEventHandler<TSender, TResult> {
      val type = typeOf<TypedEventHandler<TSender, TResult>>()
      return TypedEventHandler(type, pointer)
    }

    @JvmStatic
    public fun <TSender, TResult> nativeFn(
      type: KType,
      fn: TypedEventHandlerBody<TSender, TResult>,
      thisPtr: MemoryAddress,
      sender: Any,
      args: Any
    ): Int {
      try {
        val sender_Type = type!!.arguments[0].type!!
        val sender_Managed = runtimeFromNativeJF<Any>(sender, sender_Type) as TSender
        val args_Type = type!!.arguments[1].type!!
        val args_Managed = runtimeFromNativeJF<Any>(args, args_Type) as TResult
        fn(sender_Managed, args_Managed)
      } catch (e: Throwable) {
        e.printStackTrace()
        return WinNT.E_FAIL
      }
      return 0
    }
  }

  public class ByReference<TSender, TResult> : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TypedEventHandler<TSender, TResult>>, ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): TypedEventHandler<TSender, TResult> = TypedEventHandler<TSender,
        TResult>(type!!, pointer.getPointer(0))

    public fun setValue(value: TypedEventHandler<TSender, TResult>): Unit {
      pointer = value.pointer!!
    }
  }

  public object ABI : IParameterizedABI<TypedEventHandler<*, *>, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(type: KType, segment: MemoryAddress): TypedEventHandler<*, *> {
      val address = segment.toRawLongValue()
      return TypedEventHandler<Unit, Unit>(type, Pointer(address))
    }

    public override fun toNative(obj: TypedEventHandler<*, *>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
