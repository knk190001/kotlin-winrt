package Windows.Media.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
import Windows.Media.IMediaExtension
import Windows.Media.IMediaExtension.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFaceDetectionEffect.ABI::class)
@Signature("{ae15ebd2-0542-42a9-bc90-f283a29f46c1}")
@Guid("ae15ebd2054242a9bc90f283a29f46c1")
@WinRTInterface("ae15ebd2054242a9bc90f283a29f46c1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFaceDetectionEffect.ByReference::class)
public interface IFaceDetectionEffect : NativeMapped, IWinRTInterface, IMediaExtension {
  @InterfaceMethod(0)
  public fun put_Enabled(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_Enabled(): Boolean

  @InterfaceMethod(2)
  public fun put_DesiredDetectionInterval(value: TimeSpan?): Unit

  @InterfaceMethod(3)
  public fun get_DesiredDetectionInterval(): TimeSpan?

  @InterfaceMethod(4)
  public fun add_FaceDetected(handler: TypedEventHandler<FaceDetectionEffect?,
      FaceDetectedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_FaceDetected(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFaceDetectionEffect> {
    public override fun getValue() = ABI.makeIFaceDetectionEffect(pointer.getPointer(0))

    public fun setValue(value: IFaceDetectionEffect_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFaceDetectionEffect, IMediaExtension.WithDefault {
    public val __501431140_Ptr: Pointer?

    public val _501431140_VtblPtr: Pointer?
      get() = __501431140_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Enabled(value: Boolean): Unit {
      val fnPtr = _501431140_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__501431140_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Enabled(): Boolean {
      val fnPtr = _501431140_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__501431140_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_DesiredDetectionInterval(value: TimeSpan?): Unit {
      val fnPtr = _501431140_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__501431140_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_DesiredDetectionInterval(): TimeSpan? {
      val fnPtr = _501431140_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__501431140_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun add_FaceDetected(handler: TypedEventHandler<FaceDetectionEffect?,
        FaceDetectedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _501431140_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__501431140_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_FaceDetected(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _501431140_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__501431140_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFaceDetectionEffect_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaExtension {
    public override val __9720779_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_501431140_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __501431140_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFaceDetectionEffect, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ae15ebd2054242a9bc90f283a29f46c1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFaceDetectionEffect(ptr: Pointer?): WithDefault = IFaceDetectionEffect_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFaceDetectionEffect {
      val address = segment.toRawLongValue()
      return makeIFaceDetectionEffect(Pointer(address))
    }

    public override fun toNative(obj: IFaceDetectionEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__501431140_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFaceDetectionEffect): Array<IFaceDetectionEffect?> =
        (elements as
        Array<IFaceDetectionEffect?>).castToImpl<IFaceDetectionEffect,IFaceDetectionEffect_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFaceDetectionEffect?> =
        arrayOfNulls<IFaceDetectionEffect_Impl>(size) as Array<IFaceDetectionEffect?>
  }
}
