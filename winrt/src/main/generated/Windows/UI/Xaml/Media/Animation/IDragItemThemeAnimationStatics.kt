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

@ABIMarker(IDragItemThemeAnimationStatics.ABI::class)
@Signature("{6218b9f5-013a-4fb1-86fc-92bc4e8d0241}")
@Guid("6218b9f5013a4fb186fc92bc4e8d0241")
@WinRTInterface("6218b9f5013a4fb186fc92bc4e8d0241")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragItemThemeAnimationStatics.ByReference::class)
public interface IDragItemThemeAnimationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetNameProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDragItemThemeAnimationStatics> {
    public override fun getValue() = ABI.makeIDragItemThemeAnimationStatics(pointer.getPointer(0))

    public fun setValue(value: IDragItemThemeAnimationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragItemThemeAnimationStatics {
    public val __241797917_Ptr: Pointer?

    public val _241797917_VtblPtr: Pointer?
      get() = __241797917_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetNameProperty(): DependencyProperty? {
      val fnPtr = _241797917_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__241797917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IDragItemThemeAnimationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __241797917_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragItemThemeAnimationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6218b9f5013a4fb186fc92bc4e8d0241")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragItemThemeAnimationStatics(ptr: Pointer?): WithDefault =
        IDragItemThemeAnimationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragItemThemeAnimationStatics {
      val address = segment.toRawLongValue()
      return makeIDragItemThemeAnimationStatics(Pointer(address))
    }

    public override fun toNative(obj: IDragItemThemeAnimationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__241797917_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragItemThemeAnimationStatics):
        Array<IDragItemThemeAnimationStatics?> = (elements as
        Array<IDragItemThemeAnimationStatics?>).castToImpl<IDragItemThemeAnimationStatics,IDragItemThemeAnimationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragItemThemeAnimationStatics?> =
        arrayOfNulls<IDragItemThemeAnimationStatics_Impl>(size) as
        Array<IDragItemThemeAnimationStatics?>
  }
}
