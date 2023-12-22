package Windows.Media.Audio

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IEqualizerEffectDefinition.ABI::class)
@Signature("{023f6f1f-83fe-449a-a822-c696442d16b0}")
@Guid("023f6f1f83fe449aa822c696442d16b0")
@WinRTInterface("023f6f1f83fe449aa822c696442d16b0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEqualizerEffectDefinition.ByReference::class)
public interface IEqualizerEffectDefinition : NativeMapped, IWinRTInterface, IAudioEffectDefinition
    {
  @InterfaceMethod(0)
  public fun get_Bands(): IVectorView<EqualizerBand?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEqualizerEffectDefinition> {
    public override fun getValue() = ABI.makeIEqualizerEffectDefinition(pointer.getPointer(0))

    public fun setValue(value: IEqualizerEffectDefinition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEqualizerEffectDefinition, IAudioEffectDefinition.WithDefault {
    public val __626505518_Ptr: Pointer?

    public val _626505518_VtblPtr: Pointer?
      get() = __626505518_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Bands(): IVectorView<EqualizerBand?>? {
      val fnPtr = _626505518_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<EqualizerBand?>>()
      val hr = fn.invokeHR(arrayOf(__626505518_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<EqualizerBand?>>(result.getValue())
      return resultValue
    }
  }

  public class IEqualizerEffectDefinition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAudioEffectDefinition {
    public override val __1562923618_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_626505518_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __626505518_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEqualizerEffectDefinition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("023f6f1f83fe449aa822c696442d16b0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEqualizerEffectDefinition(ptr: Pointer?): WithDefault =
        IEqualizerEffectDefinition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEqualizerEffectDefinition {
      val address = segment.toRawLongValue()
      return makeIEqualizerEffectDefinition(Pointer(address))
    }

    public override fun toNative(obj: IEqualizerEffectDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__626505518_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEqualizerEffectDefinition):
        Array<IEqualizerEffectDefinition?> = (elements as
        Array<IEqualizerEffectDefinition?>).castToImpl<IEqualizerEffectDefinition,IEqualizerEffectDefinition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEqualizerEffectDefinition?> =
        arrayOfNulls<IEqualizerEffectDefinition_Impl>(size) as Array<IEqualizerEffectDefinition?>
  }
}
