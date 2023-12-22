package Windows.Media.Audio

import Windows.Media.Effects.IAudioEffectDefinition
import Windows.Media.Effects.IAudioEffectDefinition.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ILimiterEffectDefinition.ABI::class)
@Signature("{6b755d19-2603-47ba-bdeb-39055e3486dc}")
@Guid("6b755d19260347babdeb39055e3486dc")
@WinRTInterface("6b755d19260347babdeb39055e3486dc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILimiterEffectDefinition.ByReference::class)
public interface ILimiterEffectDefinition : NativeMapped, IWinRTInterface, IAudioEffectDefinition {
  @InterfaceMethod(0)
  public fun put_Release(value: WinDef.UINT): Unit

  @InterfaceMethod(1)
  public fun get_Release(): WinDef.UINT

  @InterfaceMethod(2)
  public fun put_Loudness(value: WinDef.UINT): Unit

  @InterfaceMethod(3)
  public fun get_Loudness(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILimiterEffectDefinition> {
    public override fun getValue() = ABI.makeILimiterEffectDefinition(pointer.getPointer(0))

    public fun setValue(value: ILimiterEffectDefinition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILimiterEffectDefinition, IAudioEffectDefinition.WithDefault {
    public val __416587780_Ptr: Pointer?

    public val _416587780_VtblPtr: Pointer?
      get() = __416587780_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Release(value: WinDef.UINT): Unit {
      val fnPtr = _416587780_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__416587780_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Release(): WinDef.UINT {
      val fnPtr = _416587780_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__416587780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Loudness(value: WinDef.UINT): Unit {
      val fnPtr = _416587780_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__416587780_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Loudness(): WinDef.UINT {
      val fnPtr = _416587780_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__416587780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class ILimiterEffectDefinition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAudioEffectDefinition {
    public override val __1562923618_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_416587780_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __416587780_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILimiterEffectDefinition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b755d19260347babdeb39055e3486dc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILimiterEffectDefinition(ptr: Pointer?): WithDefault =
        ILimiterEffectDefinition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILimiterEffectDefinition {
      val address = segment.toRawLongValue()
      return makeILimiterEffectDefinition(Pointer(address))
    }

    public override fun toNative(obj: ILimiterEffectDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__416587780_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILimiterEffectDefinition):
        Array<ILimiterEffectDefinition?> = (elements as
        Array<ILimiterEffectDefinition?>).castToImpl<ILimiterEffectDefinition,ILimiterEffectDefinition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILimiterEffectDefinition?> =
        arrayOfNulls<ILimiterEffectDefinition_Impl>(size) as Array<ILimiterEffectDefinition?>
  }
}
