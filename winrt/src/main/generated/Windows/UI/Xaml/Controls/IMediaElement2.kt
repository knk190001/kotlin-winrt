package Windows.UI.Xaml.Controls

import Windows.Foundation.Uri
import Windows.Media.Core.IMediaSource
import Windows.UI.Xaml.Media.Stretch
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaElement2.ABI::class)
@Signature("{fd53da65-b186-4654-bfdb-180ed26cad07}")
@Guid("fd53da65b1864654bfdb180ed26cad07")
@WinRTInterface("fd53da65b1864654bfdb180ed26cad07")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaElement2.ByReference::class)
public interface IMediaElement2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AreTransportControlsEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_AreTransportControlsEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Stretch(): Stretch?

  @InterfaceMethod(3)
  public fun put_Stretch(value: Stretch?): Unit

  @InterfaceMethod(4)
  public fun get_IsFullWindow(): Boolean

  @InterfaceMethod(5)
  public fun put_IsFullWindow(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun SetMediaStreamSource(source: IMediaSource?): Unit

  @InterfaceMethod(7)
  public fun get_PlayToPreferredSourceUri(): Uri?

  @InterfaceMethod(8)
  public fun put_PlayToPreferredSourceUri(value: Uri?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaElement2>
      {
    public override fun getValue() = ABI.makeIMediaElement2(pointer.getPointer(0))

    public fun setValue(value: IMediaElement2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaElement2 {
    public val __141057506_Ptr: Pointer?

    public val _141057506_VtblPtr: Pointer?
      get() = __141057506_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AreTransportControlsEnabled(): Boolean {
      val fnPtr = _141057506_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__141057506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AreTransportControlsEnabled(value: Boolean): Unit {
      val fnPtr = _141057506_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__141057506_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Stretch(): Stretch? {
      val fnPtr = _141057506_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Stretch>()
      val hr = fn.invokeHR(arrayOf(__141057506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Stretch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Stretch(value: Stretch?): Unit {
      val fnPtr = _141057506_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__141057506_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsFullWindow(): Boolean {
      val fnPtr = _141057506_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__141057506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsFullWindow(value: Boolean): Unit {
      val fnPtr = _141057506_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__141057506_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun SetMediaStreamSource(source: IMediaSource?): Unit {
      val fnPtr = _141057506_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__141057506_Ptr, marshalToNative(source),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_PlayToPreferredSourceUri(): Uri? {
      val fnPtr = _141057506_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__141057506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_PlayToPreferredSourceUri(value: Uri?): Unit {
      val fnPtr = _141057506_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__141057506_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaElement2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __141057506_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaElement2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fd53da65b1864654bfdb180ed26cad07")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaElement2(ptr: Pointer?): WithDefault = IMediaElement2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaElement2 {
      val address = segment.toRawLongValue()
      return makeIMediaElement2(Pointer(address))
    }

    public override fun toNative(obj: IMediaElement2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__141057506_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaElement2): Array<IMediaElement2?> = (elements as
        Array<IMediaElement2?>).castToImpl<IMediaElement2,IMediaElement2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaElement2?> =
        arrayOfNulls<IMediaElement2_Impl>(size) as Array<IMediaElement2?>
  }
}
