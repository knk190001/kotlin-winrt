package Windows.Globalization.Collation

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICharacterGrouping.ABI::class)
@Signature("{fae761bb-805d-4bb0-95bb-c1f7c3e8eb8e}")
@Guid("fae761bb805d4bb095bbc1f7c3e8eb8e")
@WinRTInterface("fae761bb805d4bb095bbc1f7c3e8eb8e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICharacterGrouping.ByReference::class)
public interface ICharacterGrouping : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_First(): String?

  @InterfaceMethod(1)
  public fun get_Label(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICharacterGrouping> {
    public override fun getValue() = ABI.makeICharacterGrouping(pointer.getPointer(0))

    public fun setValue(value: ICharacterGrouping_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICharacterGrouping {
    public val __1730464308_Ptr: Pointer?

    public val _1730464308_VtblPtr: Pointer?
      get() = __1730464308_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_First(): String? {
      val fnPtr = _1730464308_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1730464308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Label(): String? {
      val fnPtr = _1730464308_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1730464308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICharacterGrouping_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1730464308_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICharacterGrouping, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fae761bb805d4bb095bbc1f7c3e8eb8e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICharacterGrouping(ptr: Pointer?): WithDefault = ICharacterGrouping_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICharacterGrouping {
      val address = segment.toRawLongValue()
      return makeICharacterGrouping(Pointer(address))
    }

    public override fun toNative(obj: ICharacterGrouping): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1730464308_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICharacterGrouping): Array<ICharacterGrouping?> =
        (elements as
        Array<ICharacterGrouping?>).castToImpl<ICharacterGrouping,ICharacterGrouping_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICharacterGrouping?> =
        arrayOfNulls<ICharacterGrouping_Impl>(size) as Array<ICharacterGrouping?>
  }
}
