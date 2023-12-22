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

@ABIMarker(IItemsRepeaterStatics2.ABI::class)
@Signature("{83d8b5ea-ca31-5192-b9a9-2a62e60194e7}")
@Guid("83d8b5eaca315192b9a92a62e60194e7")
@WinRTInterface("83d8b5eaca315192b9a92a62e60194e7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsRepeaterStatics2.ByReference::class)
public interface IItemsRepeaterStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemTransitionProviderProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsRepeaterStatics2> {
    public override fun getValue() = ABI.makeIItemsRepeaterStatics2(pointer.getPointer(0))

    public fun setValue(value: IItemsRepeaterStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsRepeaterStatics2 {
    public val __1593137874_Ptr: Pointer?

    public val _1593137874_VtblPtr: Pointer?
      get() = __1593137874_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemTransitionProviderProperty(): DependencyProperty? {
      val fnPtr = _1593137874_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1593137874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IItemsRepeaterStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1593137874_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsRepeaterStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("83d8b5eaca315192b9a92a62e60194e7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsRepeaterStatics2(ptr: Pointer?): WithDefault =
        IItemsRepeaterStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsRepeaterStatics2 {
      val address = segment.toRawLongValue()
      return makeIItemsRepeaterStatics2(Pointer(address))
    }

    public override fun toNative(obj: IItemsRepeaterStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1593137874_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsRepeaterStatics2): Array<IItemsRepeaterStatics2?> =
        (elements as
        Array<IItemsRepeaterStatics2?>).castToImpl<IItemsRepeaterStatics2,IItemsRepeaterStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsRepeaterStatics2?> =
        arrayOfNulls<IItemsRepeaterStatics2_Impl>(size) as Array<IItemsRepeaterStatics2?>
  }
}
