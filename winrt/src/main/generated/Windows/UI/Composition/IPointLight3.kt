package Windows.UI.Composition

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

@ABIMarker(IPointLight3.ABI::class)
@Signature("{4c0a8367-d4e9-468a-87ae-7ba43ab29485}")
@Guid("4c0a8367d4e9468a87ae7ba43ab29485")
@WinRTInterface("4c0a8367d4e9468a87ae7ba43ab29485")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointLight3.ByReference::class)
public interface IPointLight3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MinAttenuationCutoff(): Float

  @InterfaceMethod(1)
  public fun put_MinAttenuationCutoff(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_MaxAttenuationCutoff(): Float

  @InterfaceMethod(3)
  public fun put_MaxAttenuationCutoff(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPointLight3> {
    public override fun getValue() = ABI.makeIPointLight3(pointer.getPointer(0))

    public fun setValue(value: IPointLight3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointLight3 {
    public val __1158716641_Ptr: Pointer?

    public val _1158716641_VtblPtr: Pointer?
      get() = __1158716641_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MinAttenuationCutoff(): Float {
      val fnPtr = _1158716641_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1158716641_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_MinAttenuationCutoff(value: Float): Unit {
      val fnPtr = _1158716641_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1158716641_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MaxAttenuationCutoff(): Float {
      val fnPtr = _1158716641_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1158716641_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_MaxAttenuationCutoff(value: Float): Unit {
      val fnPtr = _1158716641_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1158716641_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPointLight3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1158716641_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointLight3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4c0a8367d4e9468a87ae7ba43ab29485")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointLight3(ptr: Pointer?): WithDefault = IPointLight3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointLight3 {
      val address = segment.toRawLongValue()
      return makeIPointLight3(Pointer(address))
    }

    public override fun toNative(obj: IPointLight3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1158716641_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointLight3): Array<IPointLight3?> = (elements as
        Array<IPointLight3?>).castToImpl<IPointLight3,IPointLight3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointLight3?> =
        arrayOfNulls<IPointLight3_Impl>(size) as Array<IPointLight3?>
  }
}
