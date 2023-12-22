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

public fun interface EventHandlerBody<T> {
  public operator fun invoke(sender: IUnknown?, args: T?): Unit
}

@ABIMarker(EventHandler.ABI::class)
@GenericType
@DynamicSignature
@Guid("9de1c5356ae111e084e118a905bcc53f")
@WinRTByReference(EventHandler.ByReference::class)
public class EventHandler<T>(
  public val type: KType? = null,
  public val body: EventHandlerBody<T>? = null,
  ptr: Pointer? = Pointer.NULL
) : Delegate() {
  public operator fun invoke(sender: IUnknown, args: T): Unit {
    body!!(sender, args)
  }

  public companion object {
    public val nativeFnHandle: MethodHandle
      @NativeFunctionMarker
      get() = MethodHandles.lookup().findStatic( EventHandler::class.java, "nativeFn",
        MethodType.methodType(Int::class.java, 
        KType::class.java, EventHandlerBody::class.java, MemoryAddress::class.java,
            MemoryAddress::class.java, Any::class.java, )

      )

    public inline operator fun <reified T> invoke(fn: EventHandlerBody<T>): EventHandler<T> {
      val session = MemorySession.global()
      val handleDescriptorPair = transformParameterizedHandle(typeOf<EventHandler<T>>())
      val methodHandle = handleDescriptorPair.first.bindTo(fn)
      val functionDescriptor = handleDescriptorPair.second
      val stub = Linker.nativeLinker().upcallStub(methodHandle, functionDescriptor, session)
      val newDelegate = EventHandler(typeOf<EventHandler<T>>(), fn, Memory(12))
      val guid = guidOf<EventHandler<T>>()
      newDelegate.init(listOf(IUnknown.ABI.IID, guid), Pointer(stub.address().toRawLongValue()))
      return newDelegate
    }

    public operator fun <T> invoke(type: KType, ptr: Pointer?): EventHandler<T> {
      val thisPtr = ptr!!.getPointer(0)
      val vtbl = thisPtr!!.getPointer(0)
      val function = Function.getFunction(vtbl.getPointer(3L * Native.POINTER_SIZE))
      val body: EventHandlerBody<T> = EventHandlerBody<T>  {
        sender, args ->
        val hr = function.invokeHR(arrayOf(thisPtr, sender, marshalToNative(args,
            type!!.arguments[0].type!!)))
        checkHR(hr)
      }
      return EventHandler(type, body, thisPtr)
    }

    public inline operator fun <reified T> invoke(pointer: Pointer?): EventHandler<T> {
      val type = typeOf<EventHandler<T>>()
      return EventHandler(type, pointer)
    }

    @JvmStatic
    public fun <T> nativeFn(
      type: KType,
      fn: EventHandlerBody<T>,
      thisPtr: MemoryAddress,
      sender: MemoryAddress,
      args: Any
    ): Int {
      try {
        val sender_Managed = IUnknown.ABI.fromNative(sender)
        val args_Type = type!!.arguments[0].type!!
        val args_Managed = runtimeFromNativeJF<Any>(args, args_Type) as T
        fn(sender_Managed, args_Managed)
      } catch (e: Throwable) {
        e.printStackTrace()
        return WinNT.E_FAIL
      }
      return 0
    }
  }

  public class ByReference<T> : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EventHandler<T>>, ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): EventHandler<T> = EventHandler<T>(type!!, pointer.getPointer(0))

    public fun setValue(value: EventHandler<T>): Unit {
      pointer = value.pointer!!
    }
  }

  public object ABI : IParameterizedABI<EventHandler<*>, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(type: KType, segment: MemoryAddress): EventHandler<*> {
      val address = segment.toRawLongValue()
      return EventHandler<Unit>(type, Pointer(address))
    }

    public override fun toNative(obj: EventHandler<*>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
