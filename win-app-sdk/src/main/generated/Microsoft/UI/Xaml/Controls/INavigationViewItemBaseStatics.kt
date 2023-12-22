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

@ABIMarker(INavigationViewItemBaseStatics.ABI::class)
@Signature("{71a0c438-f0c2-5093-8906-c1c3c02de791}")
@Guid("71a0c438f0c250938906c1c3c02de791")
@WinRTInterface("71a0c438f0c250938906c1c3c02de791")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemBaseStatics.ByReference::class)
public interface INavigationViewItemBaseStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSelectedProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemBaseStatics> {
    public override fun getValue() = ABI.makeINavigationViewItemBaseStatics(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemBaseStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemBaseStatics {
    public val __1999815135_Ptr: Pointer?

    public val _1999815135_VtblPtr: Pointer?
      get() = __1999815135_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSelectedProperty(): DependencyProperty? {
      val fnPtr = _1999815135_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1999815135_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewItemBaseStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1999815135_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemBaseStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("71a0c438f0c250938906c1c3c02de791")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemBaseStatics(ptr: Pointer?): WithDefault =
        INavigationViewItemBaseStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItemBaseStatics {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemBaseStatics(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemBaseStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1999815135_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemBaseStatics):
        Array<INavigationViewItemBaseStatics?> = (elements as
        Array<INavigationViewItemBaseStatics?>).castToImpl<INavigationViewItemBaseStatics,INavigationViewItemBaseStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemBaseStatics?> =
        arrayOfNulls<INavigationViewItemBaseStatics_Impl>(size) as
        Array<INavigationViewItemBaseStatics?>
  }
}
