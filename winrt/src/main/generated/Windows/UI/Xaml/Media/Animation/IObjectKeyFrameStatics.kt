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

@ABIMarker(IObjectKeyFrameStatics.ABI::class)
@Signature("{2cd6ab00-5319-4286-8eed-4e755ea0cf9c}")
@Guid("2cd6ab00531942868eed4e755ea0cf9c")
@WinRTInterface("2cd6ab00531942868eed4e755ea0cf9c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IObjectKeyFrameStatics.ByReference::class)
public interface IObjectKeyFrameStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ValueProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_KeyTimeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IObjectKeyFrameStatics> {
    public override fun getValue() = ABI.makeIObjectKeyFrameStatics(pointer.getPointer(0))

    public fun setValue(value: IObjectKeyFrameStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IObjectKeyFrameStatics {
    public val __1209340398_Ptr: Pointer?

    public val _1209340398_VtblPtr: Pointer?
      get() = __1209340398_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ValueProperty(): DependencyProperty? {
      val fnPtr = _1209340398_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1209340398_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_KeyTimeProperty(): DependencyProperty? {
      val fnPtr = _1209340398_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1209340398_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IObjectKeyFrameStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1209340398_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IObjectKeyFrameStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2cd6ab00531942868eed4e755ea0cf9c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIObjectKeyFrameStatics(ptr: Pointer?): WithDefault =
        IObjectKeyFrameStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IObjectKeyFrameStatics {
      val address = segment.toRawLongValue()
      return makeIObjectKeyFrameStatics(Pointer(address))
    }

    public override fun toNative(obj: IObjectKeyFrameStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1209340398_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IObjectKeyFrameStatics): Array<IObjectKeyFrameStatics?> =
        (elements as
        Array<IObjectKeyFrameStatics?>).castToImpl<IObjectKeyFrameStatics,IObjectKeyFrameStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IObjectKeyFrameStatics?> =
        arrayOfNulls<IObjectKeyFrameStatics_Impl>(size) as Array<IObjectKeyFrameStatics?>
  }
}
