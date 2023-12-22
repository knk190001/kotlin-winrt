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

@ABIMarker(IItemsRepeater2.ABI::class)
@Signature("{265e249a-2812-55b6-a191-cb96089b51ac}")
@Guid("265e249a281255b6a191cb96089b51ac")
@WinRTInterface("265e249a281255b6a191cb96089b51ac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsRepeater2.ByReference::class)
public interface IItemsRepeater2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemTransitionProvider(): ItemCollectionTransitionProvider?

  @InterfaceMethod(1)
  public fun put_ItemTransitionProvider(value: ItemCollectionTransitionProvider?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsRepeater2> {
    public override fun getValue() = ABI.makeIItemsRepeater2(pointer.getPointer(0))

    public fun setValue(value: IItemsRepeater2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsRepeater2 {
    public val __265963345_Ptr: Pointer?

    public val _265963345_VtblPtr: Pointer?
      get() = __265963345_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemTransitionProvider(): ItemCollectionTransitionProvider? {
      val fnPtr = _265963345_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemCollectionTransitionProvider>()
      val hr = fn.invokeHR(arrayOf(__265963345_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemCollectionTransitionProvider>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ItemTransitionProvider(value: ItemCollectionTransitionProvider?): Unit {
      val fnPtr = _265963345_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__265963345_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IItemsRepeater2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __265963345_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsRepeater2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("265e249a281255b6a191cb96089b51ac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsRepeater2(ptr: Pointer?): WithDefault = IItemsRepeater2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsRepeater2 {
      val address = segment.toRawLongValue()
      return makeIItemsRepeater2(Pointer(address))
    }

    public override fun toNative(obj: IItemsRepeater2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__265963345_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsRepeater2): Array<IItemsRepeater2?> = (elements as
        Array<IItemsRepeater2?>).castToImpl<IItemsRepeater2,IItemsRepeater2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsRepeater2?> =
        arrayOfNulls<IItemsRepeater2_Impl>(size) as Array<IItemsRepeater2?>
  }
}
