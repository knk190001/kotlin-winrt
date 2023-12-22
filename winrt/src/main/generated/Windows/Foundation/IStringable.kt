package Windows.Foundation

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

@ABIMarker(IStringable.ABI::class)
@Signature("{96369f54-8eb6-48f0-abce-c1b211e627c3}")
@Guid("96369f548eb648f0abcec1b211e627c3")
@WinRTInterface("96369f548eb648f0abcec1b211e627c3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStringable.ByReference::class)
public interface IStringable : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ToString(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStringable> {
    public override fun getValue() = ABI.makeIStringable(pointer.getPointer(0))

    public fun setValue(value: IStringable_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStringable {
    public val __328683030_Ptr: Pointer?

    public val _328683030_VtblPtr: Pointer?
      get() = __328683030_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ToString(): String? {
      val fnPtr = _328683030_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__328683030_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IStringable_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __328683030_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStringable, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("96369f548eb648f0abcec1b211e627c3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStringable(ptr: Pointer?): WithDefault = IStringable_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStringable {
      val address = segment.toRawLongValue()
      return makeIStringable(Pointer(address))
    }

    public override fun toNative(obj: IStringable): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__328683030_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStringable): Array<IStringable?> = (elements as
        Array<IStringable?>).castToImpl<IStringable,IStringable_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStringable?> =
        arrayOfNulls<IStringable_Impl>(size) as Array<IStringable?>
  }
}
