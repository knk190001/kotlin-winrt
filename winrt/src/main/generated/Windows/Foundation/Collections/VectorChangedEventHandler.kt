package Windows.Foundation.Collections

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmStatic
import kotlin.reflect.KType
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

public fun interface VectorChangedEventHandlerBody<T> {
  public operator fun invoke(sender: IObservableVector<T>?, event: IVectorChangedEventArgs?): Unit
}

@ABIMarker(VectorChangedEventHandler.ABI::class)
@GenericType
@DynamicSignature
@Guid("0c0517529fbf4c70aa0c0e4c82d9a761")
@WinRTByReference(VectorChangedEventHandler.ByReference::class)
public class VectorChangedEventHandler<T>(
  public val type: KType? = null,
  public val body: VectorChangedEventHandlerBody<T>? = null,
  ptr: Pointer? = Pointer.NULL
) : Delegate() {
  public operator fun invoke(sender: IObservableVector<T>, event: IVectorChangedEventArgs): Unit {
    body!!(sender, event)
  }

  public companion object {
    public val nativeFnHandle: MethodHandle
      @NativeFunctionMarker
      get() = MethodHandles.lookup().findStatic( VectorChangedEventHandler::class.java, "nativeFn",
        MethodType.methodType(Int::class.java, 
        KType::class.java, VectorChangedEventHandlerBody::class.java, MemoryAddress::class.java,
            MemoryAddress::class.java, MemoryAddress::class.java, )

      )

    public inline operator fun <reified T> invoke(fn: VectorChangedEventHandlerBody<T>):
        VectorChangedEventHandler<T> {
      val session = MemorySession.global()
      val handleDescriptorPair =
          transformParameterizedHandle(typeOf<VectorChangedEventHandler<T>>())
      val methodHandle = handleDescriptorPair.first.bindTo(fn)
      val functionDescriptor = handleDescriptorPair.second
      val stub = Linker.nativeLinker().upcallStub(methodHandle, functionDescriptor, session)
      val newDelegate = VectorChangedEventHandler(typeOf<VectorChangedEventHandler<T>>(), fn,
          Memory(12))
      val guid = guidOf<VectorChangedEventHandler<T>>()
      newDelegate.init(listOf(IUnknown.ABI.IID, guid), Pointer(stub.address().toRawLongValue()))
      return newDelegate
    }

    public operator fun <T> invoke(type: KType, ptr: Pointer?): VectorChangedEventHandler<T> {
      val thisPtr = ptr!!.getPointer(0)
      val vtbl = thisPtr!!.getPointer(0)
      val function = Function.getFunction(vtbl.getPointer(3L * Native.POINTER_SIZE))
      val body: VectorChangedEventHandlerBody<T> = VectorChangedEventHandlerBody<T>  {
        sender, event ->
        val sender_Native = sender!!.toNative() as Pointer
        val event_Native = event!!.toNative() as Pointer
        val hr = function.invokeHR(arrayOf(thisPtr, sender_Native, event_Native))
        checkHR(hr)
      }
      return VectorChangedEventHandler(type, body, thisPtr)
    }

    public inline operator fun <reified T> invoke(pointer: Pointer?): VectorChangedEventHandler<T> {
      val type = typeOf<VectorChangedEventHandler<T>>()
      return VectorChangedEventHandler(type, pointer)
    }

    @JvmStatic
    public fun <T> nativeFn(
      type: KType,
      fn: VectorChangedEventHandlerBody<T>,
      thisPtr: MemoryAddress,
      sender: MemoryAddress,
      event: MemoryAddress
    ): Int {
      try {
        val sender_Type = Windows.Foundation.Collections.IObservableVector::class.createType(listOf(
              type!!.arguments[0],
            ))
        val sender_Managed =
            IObservableVector.ABI.makeIObservableVector<T>(Pointer(sender.toRawLongValue()),
            sender_Type)
        val event_Managed =
            IVectorChangedEventArgs.ABI.makeIVectorChangedEventArgs(Pointer(event.toRawLongValue()),
            )
        fn(sender_Managed, event_Managed)
      } catch (e: Throwable) {
        e.printStackTrace()
        return WinNT.E_FAIL
      }
      return 0
    }
  }

  public class ByReference<T> : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VectorChangedEventHandler<T>>, ISpecializable {
    public var type: KType? = null

    public override fun specialize(type: KType): Unit {
      this.type = type
    }

    public override fun getValue(): VectorChangedEventHandler<T> =
        VectorChangedEventHandler<T>(type!!, pointer.getPointer(0))

    public fun setValue(value: VectorChangedEventHandler<T>): Unit {
      pointer = value.pointer!!
    }
  }

  public object ABI : IParameterizedABI<VectorChangedEventHandler<*>, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(type: KType, segment: MemoryAddress):
        VectorChangedEventHandler<*> {
      val address = segment.toRawLongValue()
      return VectorChangedEventHandler<Unit>(type, Pointer(address))
    }

    public override fun toNative(obj: VectorChangedEventHandler<*>): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
