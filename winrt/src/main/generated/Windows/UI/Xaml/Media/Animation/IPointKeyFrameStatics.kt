package Windows.UI.Xaml.Media.Animation

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IPointKeyFrameStatics.ABI::class)
@Signature("{95cf1b27-7965-4bec-b9fb-fbe94b65518e}")
@Guid("95cf1b2779654becb9fbfbe94b65518e")
@WinRTInterface("95cf1b2779654becb9fbfbe94b65518e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointKeyFrameStatics.ByReference::class)
public interface IPointKeyFrameStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ValueProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_KeyTimeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointKeyFrameStatics> {
    public override fun getValue() = ABI.makeIPointKeyFrameStatics(pointer.getPointer(0))

    public fun setValue(value: IPointKeyFrameStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointKeyFrameStatics {
    public val __309175059_Ptr: Pointer?

    public val _309175059_VtblPtr: Pointer?
      get() = __309175059_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ValueProperty(): DependencyProperty? {
      val fnPtr = _309175059_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__309175059_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_KeyTimeProperty(): DependencyProperty? {
      val fnPtr = _309175059_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__309175059_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPointKeyFrameStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __309175059_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointKeyFrameStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("95cf1b2779654becb9fbfbe94b65518e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointKeyFrameStatics(ptr: Pointer?): WithDefault =
        IPointKeyFrameStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointKeyFrameStatics {
      val address = segment.toRawLongValue()
      return makeIPointKeyFrameStatics(Pointer(address))
    }

    public override fun toNative(obj: IPointKeyFrameStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__309175059_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointKeyFrameStatics): Array<IPointKeyFrameStatics?> =
        (elements as
        Array<IPointKeyFrameStatics?>).castToImpl<IPointKeyFrameStatics,IPointKeyFrameStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointKeyFrameStatics?> =
        arrayOfNulls<IPointKeyFrameStatics_Impl>(size) as Array<IPointKeyFrameStatics?>
  }
}
