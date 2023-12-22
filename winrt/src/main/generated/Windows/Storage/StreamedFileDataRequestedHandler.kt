package Windows.Storage

import com.github.knk190001.winrtbinding.runtime.ABI
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.arrayFromNative
import com.github.knk190001.winrtbinding.runtime.base.Delegate
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.booleanFromNative
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.guidFromNative
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.iUnknownIID
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.setValue
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.CallbackReference
import com.sun.jna.Function
import com.sun.jna.Memory
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.win32.StdCallLibrary
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemorySession
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic
import kotlin.reflect.jvm.javaMethod
import kotlin.reflect.typeOf

public fun interface StreamedFileDataRequestedHandlerBody {
  public operator fun invoke(stream: StreamedFileDataRequest?): Unit
}

@ABIMarker(StreamedFileDataRequestedHandler.ABI::class)
@Signature("delegate({fef6a824-2fe1-4d07-a35b-b77c50b5f4cc})")
@WinRTByReference(brClass = StreamedFileDataRequestedHandler.ByReference::class)
public class StreamedFileDataRequestedHandler(
  ptr: Pointer? = Pointer.NULL
) : Delegate(ptr) {
  public fun invoke(stream: StreamedFileDataRequest?): Unit {
    val function = Function.getFunction(delegateStruct.fn!!)
    val hr = function.invokeHR(arrayOf(this.pointer,stream))
    checkHR(hr)
  }

  public companion object {
    private val nativeFnHandle: MethodHandle =
        MethodHandles.lookup().findStatic(StreamedFileDataRequestedHandler::class.java, "nativeFn",
      MethodType.methodType(Int::class.java, 
      StreamedFileDataRequestedHandlerBody::class.java, MemoryAddress::class.java,
          MemoryAddress::class.java, )
    )


    public operator fun invoke(fn: StreamedFileDataRequestedHandlerBody):
        StreamedFileDataRequestedHandler {
      val session = MemorySession.global()
      val stub = Linker.nativeLinker().upcallStub(
        nativeFnHandle.bindTo(fn),
        FunctionDescriptor.of(JAVA_INT, ADDRESS 
        , ADDRESS),
        session)
      val nativeFn = CallbackReference.getCallback(Native::class.java,
          Pointer(stub.address().toRawLongValue())) as Native
      val newDelegate = StreamedFileDataRequestedHandler(Memory(12))
      newDelegate.init(listOf(ABI.IID,iUnknownIID), nativeFn)
      return newDelegate
    }

    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun nativeFn(
      fn: StreamedFileDataRequestedHandlerBody,
      thisObj: MemoryAddress,
      stream: MemoryAddress
    ): Int {
      try {
        val stream_Managed = StreamedFileDataRequest.ABI.fromNative(stream) as
            StreamedFileDataRequest
        fn(stream_Managed)
      } catch (e: Throwable) {
        e.printStackTrace()
        return WinNT.E_FAIL
      }
      return 0
    }
  }

  public fun interface Native : StdCallLibrary.StdCallCallback {
    public fun invoke(thisPtr: Pointer, stream: StreamedFileDataRequest?): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StreamedFileDataRequestedHandler> {
    public override fun getValue(): StreamedFileDataRequestedHandler =
        StreamedFileDataRequestedHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: StreamedFileDataRequestedHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI : IABI<StreamedFileDataRequestedHandler, MemoryAddress> {
    public val IID: Guid.IID = Guid.IID("fef6a8242fe14d07a35bb77c50b5f4cc")

    public override val layout: ValueLayout = ADDRESS

    public override fun fromNative(segment: MemoryAddress): StreamedFileDataRequestedHandler {
      val address = segment.toRawLongValue()
      return StreamedFileDataRequestedHandler(Pointer(address))
    }

    public override fun toNative(obj: StreamedFileDataRequestedHandler): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
