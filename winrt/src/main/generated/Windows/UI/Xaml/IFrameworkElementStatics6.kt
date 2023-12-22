package Windows.UI.Xaml

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

@ABIMarker(IFrameworkElementStatics6.ABI::class)
@Signature("{fcc1529a-69db-4582-a7be-cf6a1cfdacd0}")
@Guid("fcc1529a69db4582a7becf6a1cfdacd0")
@WinRTInterface("fcc1529a69db4582a7becf6a1cfdacd0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkElementStatics6.ByReference::class)
public interface IFrameworkElementStatics6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ActualThemeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkElementStatics6> {
    public override fun getValue() = ABI.makeIFrameworkElementStatics6(pointer.getPointer(0))

    public fun setValue(value: IFrameworkElementStatics6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkElementStatics6 {
    public val __1113717409_Ptr: Pointer?

    public val _1113717409_VtblPtr: Pointer?
      get() = __1113717409_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ActualThemeProperty(): DependencyProperty? {
      val fnPtr = _1113717409_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1113717409_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IFrameworkElementStatics6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1113717409_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkElementStatics6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fcc1529a69db4582a7becf6a1cfdacd0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkElementStatics6(ptr: Pointer?): WithDefault =
        IFrameworkElementStatics6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkElementStatics6 {
      val address = segment.toRawLongValue()
      return makeIFrameworkElementStatics6(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkElementStatics6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1113717409_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkElementStatics6):
        Array<IFrameworkElementStatics6?> = (elements as
        Array<IFrameworkElementStatics6?>).castToImpl<IFrameworkElementStatics6,IFrameworkElementStatics6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkElementStatics6?> =
        arrayOfNulls<IFrameworkElementStatics6_Impl>(size) as Array<IFrameworkElementStatics6?>
  }
}
