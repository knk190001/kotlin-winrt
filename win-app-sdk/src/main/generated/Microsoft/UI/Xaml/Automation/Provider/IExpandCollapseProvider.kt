package Microsoft.UI.Xaml.Automation.Provider

import Microsoft.UI.Xaml.Automation.ExpandCollapseState
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

@ABIMarker(IExpandCollapseProvider.ABI::class)
@Signature("{6cef349c-b181-5d0b-b297-c3b0166120c3}")
@Guid("6cef349cb1815d0bb297c3b0166120c3")
@WinRTInterface("6cef349cb1815d0bb297c3b0166120c3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpandCollapseProvider.ByReference::class)
public interface IExpandCollapseProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExpandCollapseState(): ExpandCollapseState?

  @InterfaceMethod(1)
  public fun Collapse(): Unit

  @InterfaceMethod(2)
  public fun Expand(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpandCollapseProvider> {
    public override fun getValue() = ABI.makeIExpandCollapseProvider(pointer.getPointer(0))

    public fun setValue(value: IExpandCollapseProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpandCollapseProvider {
    public val __1578214981_Ptr: Pointer?

    public val _1578214981_VtblPtr: Pointer?
      get() = __1578214981_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExpandCollapseState(): ExpandCollapseState? {
      val fnPtr = _1578214981_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExpandCollapseState>()
      val hr = fn.invokeHR(arrayOf(__1578214981_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExpandCollapseState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Collapse(): Unit {
      val fnPtr = _1578214981_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1578214981_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Expand(): Unit {
      val fnPtr = _1578214981_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1578214981_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IExpandCollapseProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1578214981_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpandCollapseProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6cef349cb1815d0bb297c3b0166120c3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpandCollapseProvider(ptr: Pointer?): WithDefault =
        IExpandCollapseProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpandCollapseProvider {
      val address = segment.toRawLongValue()
      return makeIExpandCollapseProvider(Pointer(address))
    }

    public override fun toNative(obj: IExpandCollapseProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1578214981_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpandCollapseProvider): Array<IExpandCollapseProvider?>
        = (elements as
        Array<IExpandCollapseProvider?>).castToImpl<IExpandCollapseProvider,IExpandCollapseProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpandCollapseProvider?> =
        arrayOfNulls<IExpandCollapseProvider_Impl>(size) as Array<IExpandCollapseProvider?>
  }
}
