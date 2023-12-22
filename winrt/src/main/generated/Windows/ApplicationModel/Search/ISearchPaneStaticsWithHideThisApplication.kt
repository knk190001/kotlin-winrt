package Windows.ApplicationModel.Search

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

@ABIMarker(ISearchPaneStaticsWithHideThisApplication.ABI::class)
@Signature("{00732830-50f1-4d03-99ac-c6644c8ed8b5}")
@Guid("0073283050f14d0399acc6644c8ed8b5")
@WinRTInterface("0073283050f14d0399acc6644c8ed8b5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchPaneStaticsWithHideThisApplication.ByReference::class)
public interface ISearchPaneStaticsWithHideThisApplication : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun HideThisApplication(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchPaneStaticsWithHideThisApplication> {
    public override fun getValue() =
        ABI.makeISearchPaneStaticsWithHideThisApplication(pointer.getPointer(0))

    public fun setValue(value: ISearchPaneStaticsWithHideThisApplication_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchPaneStaticsWithHideThisApplication {
    public val __843129844_Ptr: Pointer?

    public val _843129844_VtblPtr: Pointer?
      get() = __843129844_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun HideThisApplication(): Unit {
      val fnPtr = _843129844_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__843129844_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISearchPaneStaticsWithHideThisApplication_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __843129844_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchPaneStaticsWithHideThisApplication, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0073283050f14d0399acc6644c8ed8b5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchPaneStaticsWithHideThisApplication(ptr: Pointer?): WithDefault =
        ISearchPaneStaticsWithHideThisApplication_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISearchPaneStaticsWithHideThisApplication {
      val address = segment.toRawLongValue()
      return makeISearchPaneStaticsWithHideThisApplication(Pointer(address))
    }

    public override fun toNative(obj: ISearchPaneStaticsWithHideThisApplication): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__843129844_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchPaneStaticsWithHideThisApplication):
        Array<ISearchPaneStaticsWithHideThisApplication?> = (elements as
        Array<ISearchPaneStaticsWithHideThisApplication?>).castToImpl<ISearchPaneStaticsWithHideThisApplication,ISearchPaneStaticsWithHideThisApplication_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchPaneStaticsWithHideThisApplication?> =
        arrayOfNulls<ISearchPaneStaticsWithHideThisApplication_Impl>(size) as
        Array<ISearchPaneStaticsWithHideThisApplication?>
  }
}
