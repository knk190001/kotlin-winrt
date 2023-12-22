package Windows.UI.Xaml.Controls

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

@ABIMarker(IItemsStackPanel2.ABI::class)
@Signature("{eeeecdb0-00b4-4534-937b-56318b293e92}")
@Guid("eeeecdb000b44534937b56318b293e92")
@WinRTInterface("eeeecdb000b44534937b56318b293e92")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsStackPanel2.ByReference::class)
public interface IItemsStackPanel2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AreStickyGroupHeadersEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_AreStickyGroupHeadersEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsStackPanel2> {
    public override fun getValue() = ABI.makeIItemsStackPanel2(pointer.getPointer(0))

    public fun setValue(value: IItemsStackPanel2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsStackPanel2 {
    public val __353703022_Ptr: Pointer?

    public val _353703022_VtblPtr: Pointer?
      get() = __353703022_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AreStickyGroupHeadersEnabled(): Boolean {
      val fnPtr = _353703022_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__353703022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AreStickyGroupHeadersEnabled(value: Boolean): Unit {
      val fnPtr = _353703022_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__353703022_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IItemsStackPanel2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __353703022_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsStackPanel2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eeeecdb000b44534937b56318b293e92")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsStackPanel2(ptr: Pointer?): WithDefault = IItemsStackPanel2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsStackPanel2 {
      val address = segment.toRawLongValue()
      return makeIItemsStackPanel2(Pointer(address))
    }

    public override fun toNative(obj: IItemsStackPanel2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__353703022_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsStackPanel2): Array<IItemsStackPanel2?> = (elements
        as Array<IItemsStackPanel2?>).castToImpl<IItemsStackPanel2,IItemsStackPanel2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsStackPanel2?> =
        arrayOfNulls<IItemsStackPanel2_Impl>(size) as Array<IItemsStackPanel2?>
  }
}
