package Windows.Devices.Lights.Effects

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

@ABIMarker(ILampArrayEffect.ABI::class)
@Signature("{11d45590-57fb-4546-b1ce-863107f740df}")
@Guid("11d4559057fb4546b1ce863107f740df")
@WinRTInterface("11d4559057fb4546b1ce863107f740df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILampArrayEffect.ByReference::class)
public interface ILampArrayEffect : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ZIndex(): Int

  @InterfaceMethod(1)
  public fun put_ZIndex(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILampArrayEffect> {
    public override fun getValue() = ABI.makeILampArrayEffect(pointer.getPointer(0))

    public fun setValue(value: ILampArrayEffect_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILampArrayEffect {
    public val __818015690_Ptr: Pointer?

    public val _818015690_VtblPtr: Pointer?
      get() = __818015690_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ZIndex(): Int {
      val fnPtr = _818015690_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__818015690_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ZIndex(value: Int): Unit {
      val fnPtr = _818015690_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__818015690_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILampArrayEffect_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __818015690_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILampArrayEffect, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("11d4559057fb4546b1ce863107f740df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILampArrayEffect(ptr: Pointer?): WithDefault = ILampArrayEffect_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILampArrayEffect {
      val address = segment.toRawLongValue()
      return makeILampArrayEffect(Pointer(address))
    }

    public override fun toNative(obj: ILampArrayEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__818015690_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILampArrayEffect): Array<ILampArrayEffect?> = (elements as
        Array<ILampArrayEffect?>).castToImpl<ILampArrayEffect,ILampArrayEffect_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILampArrayEffect?> =
        arrayOfNulls<ILampArrayEffect_Impl>(size) as Array<ILampArrayEffect?>
  }
}
