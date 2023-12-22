package Windows.UI.Input

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ICrossSlidingEventArgs2.ABI::class)
@Signature("{eefb7d48-c070-59f3-8dab-bcaf621d8687}")
@Guid("eefb7d48c07059f38dabbcaf621d8687")
@WinRTInterface("eefb7d48c07059f38dabbcaf621d8687")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICrossSlidingEventArgs2.ByReference::class)
public interface ICrossSlidingEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContactCount(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICrossSlidingEventArgs2> {
    public override fun getValue() = ABI.makeICrossSlidingEventArgs2(pointer.getPointer(0))

    public fun setValue(value: ICrossSlidingEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICrossSlidingEventArgs2 {
    public val __1774996681_Ptr: Pointer?

    public val _1774996681_VtblPtr: Pointer?
      get() = __1774996681_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContactCount(): WinDef.UINT {
      val fnPtr = _1774996681_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1774996681_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class ICrossSlidingEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1774996681_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICrossSlidingEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eefb7d48c07059f38dabbcaf621d8687")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICrossSlidingEventArgs2(ptr: Pointer?): WithDefault =
        ICrossSlidingEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICrossSlidingEventArgs2 {
      val address = segment.toRawLongValue()
      return makeICrossSlidingEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: ICrossSlidingEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1774996681_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICrossSlidingEventArgs2): Array<ICrossSlidingEventArgs2?>
        = (elements as
        Array<ICrossSlidingEventArgs2?>).castToImpl<ICrossSlidingEventArgs2,ICrossSlidingEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICrossSlidingEventArgs2?> =
        arrayOfNulls<ICrossSlidingEventArgs2_Impl>(size) as Array<ICrossSlidingEventArgs2?>
  }
}
