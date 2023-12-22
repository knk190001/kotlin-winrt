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

@ABIMarker(ISetter2.ABI::class)
@Signature("{70169561-05b1-4fa3-9d53-8e0c8c747afc}")
@Guid("7016956105b14fa39d538e0c8c747afc")
@WinRTInterface("7016956105b14fa39d538e0c8c747afc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISetter2.ByReference::class)
public interface ISetter2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Target(): TargetPropertyPath?

  @InterfaceMethod(1)
  public fun put_Target(value: TargetPropertyPath?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISetter2> {
    public override fun getValue() = ABI.makeISetter2(pointer.getPointer(0))

    public fun setValue(value: ISetter2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISetter2 {
    public val __869738239_Ptr: Pointer?

    public val _869738239_VtblPtr: Pointer?
      get() = __869738239_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Target(): TargetPropertyPath? {
      val fnPtr = _869738239_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TargetPropertyPath>()
      val hr = fn.invokeHR(arrayOf(__869738239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TargetPropertyPath>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Target(value: TargetPropertyPath?): Unit {
      val fnPtr = _869738239_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__869738239_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISetter2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __869738239_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISetter2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7016956105b14fa39d538e0c8c747afc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISetter2(ptr: Pointer?): WithDefault = ISetter2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISetter2 {
      val address = segment.toRawLongValue()
      return makeISetter2(Pointer(address))
    }

    public override fun toNative(obj: ISetter2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__869738239_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISetter2): Array<ISetter2?> = (elements as
        Array<ISetter2?>).castToImpl<ISetter2,ISetter2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISetter2?> = arrayOfNulls<ISetter2_Impl>(size) as
        Array<ISetter2?>
  }
}
