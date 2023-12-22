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

@ABIMarker(IBitmapIcon2.ABI::class)
@Signature("{0624a20a-9dd1-4201-bb20-42863da15658}")
@Guid("0624a20a9dd14201bb2042863da15658")
@WinRTInterface("0624a20a9dd14201bb2042863da15658")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapIcon2.ByReference::class)
public interface IBitmapIcon2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ShowAsMonochrome(): Boolean

  @InterfaceMethod(1)
  public fun put_ShowAsMonochrome(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBitmapIcon2> {
    public override fun getValue() = ABI.makeIBitmapIcon2(pointer.getPointer(0))

    public fun setValue(value: IBitmapIcon2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapIcon2 {
    public val __1824198990_Ptr: Pointer?

    public val _1824198990_VtblPtr: Pointer?
      get() = __1824198990_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ShowAsMonochrome(): Boolean {
      val fnPtr = _1824198990_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1824198990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ShowAsMonochrome(value: Boolean): Unit {
      val fnPtr = _1824198990_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1824198990_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBitmapIcon2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1824198990_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapIcon2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0624a20a9dd14201bb2042863da15658")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapIcon2(ptr: Pointer?): WithDefault = IBitmapIcon2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapIcon2 {
      val address = segment.toRawLongValue()
      return makeIBitmapIcon2(Pointer(address))
    }

    public override fun toNative(obj: IBitmapIcon2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1824198990_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapIcon2): Array<IBitmapIcon2?> = (elements as
        Array<IBitmapIcon2?>).castToImpl<IBitmapIcon2,IBitmapIcon2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapIcon2?> =
        arrayOfNulls<IBitmapIcon2_Impl>(size) as Array<IBitmapIcon2?>
  }
}
