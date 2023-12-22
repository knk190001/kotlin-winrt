package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(ICommonNavigationTransitionInfo.ABI::class)
@Signature("{b21cc95f-9e3d-540a-b35a-17b99dc41b1e}")
@Guid("b21cc95f9e3d540ab35a17b99dc41b1e")
@WinRTInterface("b21cc95f9e3d540ab35a17b99dc41b1e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommonNavigationTransitionInfo.ByReference::class)
public interface ICommonNavigationTransitionInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsStaggeringEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsStaggeringEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommonNavigationTransitionInfo> {
    public override fun getValue() = ABI.makeICommonNavigationTransitionInfo(pointer.getPointer(0))

    public fun setValue(value: ICommonNavigationTransitionInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommonNavigationTransitionInfo {
    public val __150341475_Ptr: Pointer?

    public val _150341475_VtblPtr: Pointer?
      get() = __150341475_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsStaggeringEnabled(): Boolean {
      val fnPtr = _150341475_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__150341475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsStaggeringEnabled(value: Boolean): Unit {
      val fnPtr = _150341475_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__150341475_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICommonNavigationTransitionInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __150341475_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommonNavigationTransitionInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b21cc95f9e3d540ab35a17b99dc41b1e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommonNavigationTransitionInfo(ptr: Pointer?): WithDefault =
        ICommonNavigationTransitionInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommonNavigationTransitionInfo {
      val address = segment.toRawLongValue()
      return makeICommonNavigationTransitionInfo(Pointer(address))
    }

    public override fun toNative(obj: ICommonNavigationTransitionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__150341475_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommonNavigationTransitionInfo):
        Array<ICommonNavigationTransitionInfo?> = (elements as
        Array<ICommonNavigationTransitionInfo?>).castToImpl<ICommonNavigationTransitionInfo,ICommonNavigationTransitionInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommonNavigationTransitionInfo?> =
        arrayOfNulls<ICommonNavigationTransitionInfo_Impl>(size) as
        Array<ICommonNavigationTransitionInfo?>
  }
}
