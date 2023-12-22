package Microsoft.UI.Composition

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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpotLight3.ABI::class)
@Signature("{c6919941-0d9f-58c8-91e2-adef6e5e70a4}")
@Guid("c69199410d9f58c891e2adef6e5e70a4")
@WinRTInterface("c69199410d9f58c891e2adef6e5e70a4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpotLight3.ByReference::class)
public interface ISpotLight3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MinAttenuationCutoff(): Float

  @InterfaceMethod(1)
  public fun put_MinAttenuationCutoff(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_MaxAttenuationCutoff(): Float

  @InterfaceMethod(3)
  public fun put_MaxAttenuationCutoff(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISpotLight3> {
    public override fun getValue() = ABI.makeISpotLight3(pointer.getPointer(0))

    public fun setValue(value: ISpotLight3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpotLight3 {
    public val __1476675160_Ptr: Pointer?

    public val _1476675160_VtblPtr: Pointer?
      get() = __1476675160_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MinAttenuationCutoff(): Float {
      val fnPtr = _1476675160_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1476675160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_MinAttenuationCutoff(value: Float): Unit {
      val fnPtr = _1476675160_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1476675160_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MaxAttenuationCutoff(): Float {
      val fnPtr = _1476675160_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1476675160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_MaxAttenuationCutoff(value: Float): Unit {
      val fnPtr = _1476675160_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1476675160_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpotLight3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1476675160_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpotLight3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c69199410d9f58c891e2adef6e5e70a4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpotLight3(ptr: Pointer?): WithDefault = ISpotLight3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpotLight3 {
      val address = segment.toRawLongValue()
      return makeISpotLight3(Pointer(address))
    }

    public override fun toNative(obj: ISpotLight3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1476675160_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpotLight3): Array<ISpotLight3?> = (elements as
        Array<ISpotLight3?>).castToImpl<ISpotLight3,ISpotLight3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpotLight3?> =
        arrayOfNulls<ISpotLight3_Impl>(size) as Array<ISpotLight3?>
  }
}
