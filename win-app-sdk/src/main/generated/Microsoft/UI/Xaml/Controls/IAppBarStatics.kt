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

@ABIMarker(IAppBarStatics.ABI::class)
@Signature("{0dc7172c-a03d-5ae4-9538-ffd804823bce}")
@Guid("0dc7172ca03d5ae49538ffd804823bce")
@WinRTInterface("0dc7172ca03d5ae49538ffd804823bce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarStatics.ByReference::class)
public interface IAppBarStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsOpenProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsStickyProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ClosedDisplayModeProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_LightDismissOverlayModeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppBarStatics>
      {
    public override fun getValue() = ABI.makeIAppBarStatics(pointer.getPointer(0))

    public fun setValue(value: IAppBarStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarStatics {
    public val __1599545652_Ptr: Pointer?

    public val _1599545652_VtblPtr: Pointer?
      get() = __1599545652_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsOpenProperty(): DependencyProperty? {
      val fnPtr = _1599545652_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1599545652_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsStickyProperty(): DependencyProperty? {
      val fnPtr = _1599545652_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1599545652_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ClosedDisplayModeProperty(): DependencyProperty? {
      val fnPtr = _1599545652_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1599545652_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_LightDismissOverlayModeProperty(): DependencyProperty? {
      val fnPtr = _1599545652_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1599545652_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1599545652_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0dc7172ca03d5ae49538ffd804823bce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarStatics(ptr: Pointer?): WithDefault = IAppBarStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarStatics {
      val address = segment.toRawLongValue()
      return makeIAppBarStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppBarStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1599545652_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarStatics): Array<IAppBarStatics?> = (elements as
        Array<IAppBarStatics?>).castToImpl<IAppBarStatics,IAppBarStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarStatics?> =
        arrayOfNulls<IAppBarStatics_Impl>(size) as Array<IAppBarStatics?>
  }
}
