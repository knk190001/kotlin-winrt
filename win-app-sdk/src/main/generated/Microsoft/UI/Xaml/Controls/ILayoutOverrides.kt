package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ILayoutOverrides.ABI::class)
@Signature("{441d00c3-dd50-5348-852d-85608cc7dce1}")
@Guid("441d00c3dd505348852d85608cc7dce1")
@WinRTInterface("441d00c3dd505348852d85608cc7dce1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILayoutOverrides.ByReference::class)
public interface ILayoutOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateDefaultItemTransitionProvider(): ItemCollectionTransitionProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILayoutOverrides> {
    public override fun getValue() = ABI.makeILayoutOverrides(pointer.getPointer(0))

    public fun setValue(value: ILayoutOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILayoutOverrides {
    public val __1359117686_Ptr: Pointer?

    public val _1359117686_VtblPtr: Pointer?
      get() = __1359117686_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateDefaultItemTransitionProvider(): ItemCollectionTransitionProvider? {
      val fnPtr = _1359117686_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemCollectionTransitionProvider>()
      val hr = fn.invokeHR(arrayOf(__1359117686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemCollectionTransitionProvider>(result.getValue())
      return resultValue
    }
  }

  public class ILayoutOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1359117686_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILayoutOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("441d00c3dd505348852d85608cc7dce1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILayoutOverrides(ptr: Pointer?): WithDefault = ILayoutOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILayoutOverrides {
      val address = segment.toRawLongValue()
      return makeILayoutOverrides(Pointer(address))
    }

    public override fun toNative(obj: ILayoutOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1359117686_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILayoutOverrides): Array<ILayoutOverrides?> = (elements as
        Array<ILayoutOverrides?>).castToImpl<ILayoutOverrides,ILayoutOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILayoutOverrides?> =
        arrayOfNulls<ILayoutOverrides_Impl>(size) as Array<ILayoutOverrides?>
  }
}
