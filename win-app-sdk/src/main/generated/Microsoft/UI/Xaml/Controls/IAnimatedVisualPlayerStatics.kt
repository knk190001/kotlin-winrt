package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAnimatedVisualPlayerStatics.ABI::class)
@Signature("{e3d18d97-c98b-5b91-80db-d70c436aa44a}")
@Guid("e3d18d97c98b5b9180dbd70c436aa44a")
@WinRTInterface("e3d18d97c98b5b9180dbd70c436aa44a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimatedVisualPlayerStatics.ByReference::class)
public interface IAnimatedVisualPlayerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AutoPlayProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_DiagnosticsProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_DurationProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_FallbackContentProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_IsAnimatedVisualLoadedProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_IsPlayingProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_PlaybackRateProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_SourceProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_StretchProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimatedVisualPlayerStatics> {
    public override fun getValue() = ABI.makeIAnimatedVisualPlayerStatics(pointer.getPointer(0))

    public fun setValue(value: IAnimatedVisualPlayerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimatedVisualPlayerStatics {
    public val __1940908410_Ptr: Pointer?

    public val _1940908410_VtblPtr: Pointer?
      get() = __1940908410_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AutoPlayProperty(): DependencyProperty? {
      val fnPtr = _1940908410_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1940908410_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DiagnosticsProperty(): DependencyProperty? {
      val fnPtr = _1940908410_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1940908410_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DurationProperty(): DependencyProperty? {
      val fnPtr = _1940908410_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1940908410_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FallbackContentProperty(): DependencyProperty? {
      val fnPtr = _1940908410_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1940908410_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IsAnimatedVisualLoadedProperty(): DependencyProperty? {
      val fnPtr = _1940908410_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1940908410_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_IsPlayingProperty(): DependencyProperty? {
      val fnPtr = _1940908410_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1940908410_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_PlaybackRateProperty(): DependencyProperty? {
      val fnPtr = _1940908410_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1940908410_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_SourceProperty(): DependencyProperty? {
      val fnPtr = _1940908410_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1940908410_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_StretchProperty(): DependencyProperty? {
      val fnPtr = _1940908410_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1940908410_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAnimatedVisualPlayerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1940908410_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimatedVisualPlayerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e3d18d97c98b5b9180dbd70c436aa44a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimatedVisualPlayerStatics(ptr: Pointer?): WithDefault =
        IAnimatedVisualPlayerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimatedVisualPlayerStatics {
      val address = segment.toRawLongValue()
      return makeIAnimatedVisualPlayerStatics(Pointer(address))
    }

    public override fun toNative(obj: IAnimatedVisualPlayerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1940908410_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimatedVisualPlayerStatics):
        Array<IAnimatedVisualPlayerStatics?> = (elements as
        Array<IAnimatedVisualPlayerStatics?>).castToImpl<IAnimatedVisualPlayerStatics,IAnimatedVisualPlayerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimatedVisualPlayerStatics?> =
        arrayOfNulls<IAnimatedVisualPlayerStatics_Impl>(size) as
        Array<IAnimatedVisualPlayerStatics?>
  }
}
