package Windows.UI.ViewManagement

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

@ABIMarker(IApplicationViewSwitcherStatics2.ABI::class)
@Signature("{60e995cd-4fc2-48c4-b8e3-395f2b9f0fc1}")
@Guid("60e995cd4fc248c4b8e3395f2b9f0fc1")
@WinRTInterface("60e995cd4fc248c4b8e3395f2b9f0fc1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationViewSwitcherStatics2.ByReference::class)
public interface IApplicationViewSwitcherStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun DisableSystemViewActivationPolicy(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationViewSwitcherStatics2> {
    public override fun getValue() = ABI.makeIApplicationViewSwitcherStatics2(pointer.getPointer(0))

    public fun setValue(value: IApplicationViewSwitcherStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationViewSwitcherStatics2 {
    public val __1515165809_Ptr: Pointer?

    public val _1515165809_VtblPtr: Pointer?
      get() = __1515165809_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun DisableSystemViewActivationPolicy(): Unit {
      val fnPtr = _1515165809_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1515165809_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IApplicationViewSwitcherStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1515165809_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationViewSwitcherStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("60e995cd4fc248c4b8e3395f2b9f0fc1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationViewSwitcherStatics2(ptr: Pointer?): WithDefault =
        IApplicationViewSwitcherStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationViewSwitcherStatics2 {
      val address = segment.toRawLongValue()
      return makeIApplicationViewSwitcherStatics2(Pointer(address))
    }

    public override fun toNative(obj: IApplicationViewSwitcherStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1515165809_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationViewSwitcherStatics2):
        Array<IApplicationViewSwitcherStatics2?> = (elements as
        Array<IApplicationViewSwitcherStatics2?>).castToImpl<IApplicationViewSwitcherStatics2,IApplicationViewSwitcherStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationViewSwitcherStatics2?> =
        arrayOfNulls<IApplicationViewSwitcherStatics2_Impl>(size) as
        Array<IApplicationViewSwitcherStatics2?>
  }
}
