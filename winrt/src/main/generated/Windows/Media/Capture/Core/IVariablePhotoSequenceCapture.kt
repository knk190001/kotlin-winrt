package Windows.Media.Capture.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVariablePhotoSequenceCapture.ABI::class)
@Signature("{d0112d1d-031e-4041-a6d6-bd742476a8ee}")
@Guid("d0112d1d031e4041a6d6bd742476a8ee")
@WinRTInterface("d0112d1d031e4041a6d6bd742476a8ee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVariablePhotoSequenceCapture.ByReference::class)
public interface IVariablePhotoSequenceCapture : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun StartAsync(): IAsyncAction?

  @InterfaceMethod(1)
  public fun StopAsync(): IAsyncAction?

  @InterfaceMethod(2)
  public fun FinishAsync(): IAsyncAction?

  @InterfaceMethod(3)
  public fun add_PhotoCaptured(handler: TypedEventHandler<VariablePhotoSequenceCapture?,
      VariablePhotoCapturedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_PhotoCaptured(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_Stopped(handler: TypedEventHandler<VariablePhotoSequenceCapture?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_Stopped(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVariablePhotoSequenceCapture> {
    public override fun getValue() = ABI.makeIVariablePhotoSequenceCapture(pointer.getPointer(0))

    public fun setValue(value: IVariablePhotoSequenceCapture_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVariablePhotoSequenceCapture {
    public val __369240540_Ptr: Pointer?

    public val _369240540_VtblPtr: Pointer?
      get() = __369240540_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun StartAsync(): IAsyncAction? {
      val fnPtr = _369240540_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__369240540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun StopAsync(): IAsyncAction? {
      val fnPtr = _369240540_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__369240540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FinishAsync(): IAsyncAction? {
      val fnPtr = _369240540_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__369240540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_PhotoCaptured(handler: TypedEventHandler<VariablePhotoSequenceCapture?,
        VariablePhotoCapturedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _369240540_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__369240540_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_PhotoCaptured(token: EventRegistrationToken?): Unit {
      val fnPtr = _369240540_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__369240540_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_Stopped(handler: TypedEventHandler<VariablePhotoSequenceCapture?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _369240540_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__369240540_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_Stopped(token: EventRegistrationToken?): Unit {
      val fnPtr = _369240540_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__369240540_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVariablePhotoSequenceCapture_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __369240540_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVariablePhotoSequenceCapture, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d0112d1d031e4041a6d6bd742476a8ee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVariablePhotoSequenceCapture(ptr: Pointer?): WithDefault =
        IVariablePhotoSequenceCapture_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVariablePhotoSequenceCapture {
      val address = segment.toRawLongValue()
      return makeIVariablePhotoSequenceCapture(Pointer(address))
    }

    public override fun toNative(obj: IVariablePhotoSequenceCapture): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__369240540_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVariablePhotoSequenceCapture):
        Array<IVariablePhotoSequenceCapture?> = (elements as
        Array<IVariablePhotoSequenceCapture?>).castToImpl<IVariablePhotoSequenceCapture,IVariablePhotoSequenceCapture_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVariablePhotoSequenceCapture?> =
        arrayOfNulls<IVariablePhotoSequenceCapture_Impl>(size) as
        Array<IVariablePhotoSequenceCapture?>
  }
}
