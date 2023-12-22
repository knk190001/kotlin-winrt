package Windows.UI.Xaml.Documents

import Windows.UI.Xaml.TextAlignment
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

@ABIMarker(IBlock2.ABI::class)
@Signature("{5ec7bdf3-1333-4a92-8318-6caedc12ef89}")
@Guid("5ec7bdf313334a9283186caedc12ef89")
@WinRTInterface("5ec7bdf313334a9283186caedc12ef89")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBlock2.ByReference::class)
public interface IBlock2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HorizontalTextAlignment(): TextAlignment?

  @InterfaceMethod(1)
  public fun put_HorizontalTextAlignment(value: TextAlignment?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBlock2> {
    public override fun getValue() = ABI.makeIBlock2(pointer.getPointer(0))

    public fun setValue(value: IBlock2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBlock2 {
    public val __1566194323_Ptr: Pointer?

    public val _1566194323_VtblPtr: Pointer?
      get() = __1566194323_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HorizontalTextAlignment(): TextAlignment? {
      val fnPtr = _1566194323_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextAlignment>()
      val hr = fn.invokeHR(arrayOf(__1566194323_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_HorizontalTextAlignment(value: TextAlignment?): Unit {
      val fnPtr = _1566194323_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1566194323_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBlock2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1566194323_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBlock2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5ec7bdf313334a9283186caedc12ef89")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBlock2(ptr: Pointer?): WithDefault = IBlock2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBlock2 {
      val address = segment.toRawLongValue()
      return makeIBlock2(Pointer(address))
    }

    public override fun toNative(obj: IBlock2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1566194323_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBlock2): Array<IBlock2?> = (elements as
        Array<IBlock2?>).castToImpl<IBlock2,IBlock2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBlock2?> = arrayOfNulls<IBlock2_Impl>(size) as
        Array<IBlock2?>
  }
}
