package Windows.UI.Xaml.Controls

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

@ABIMarker(ISplitViewStatics2.ABI::class)
@Signature("{14b7cd7a-dfbc-422c-80a9-585871297113}")
@Guid("14b7cd7adfbc422c80a9585871297113")
@WinRTInterface("14b7cd7adfbc422c80a9585871297113")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplitViewStatics2.ByReference::class)
public interface ISplitViewStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LightDismissOverlayModeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISplitViewStatics2> {
    public override fun getValue() = ABI.makeISplitViewStatics2(pointer.getPointer(0))

    public fun setValue(value: ISplitViewStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplitViewStatics2 {
    public val __1171023248_Ptr: Pointer?

    public val _1171023248_VtblPtr: Pointer?
      get() = __1171023248_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LightDismissOverlayModeProperty(): DependencyProperty? {
      val fnPtr = _1171023248_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1171023248_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISplitViewStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1171023248_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplitViewStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("14b7cd7adfbc422c80a9585871297113")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplitViewStatics2(ptr: Pointer?): WithDefault = ISplitViewStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplitViewStatics2 {
      val address = segment.toRawLongValue()
      return makeISplitViewStatics2(Pointer(address))
    }

    public override fun toNative(obj: ISplitViewStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1171023248_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplitViewStatics2): Array<ISplitViewStatics2?> =
        (elements as
        Array<ISplitViewStatics2?>).castToImpl<ISplitViewStatics2,ISplitViewStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplitViewStatics2?> =
        arrayOfNulls<ISplitViewStatics2_Impl>(size) as Array<ISplitViewStatics2?>
  }
}
