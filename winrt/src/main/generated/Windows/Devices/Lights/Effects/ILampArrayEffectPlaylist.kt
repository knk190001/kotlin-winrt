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

@ABIMarker(ILampArrayEffectPlaylist.ABI::class)
@Signature("{7de58bfe-6f61-4103-98c7-d6632f7b9169}")
@Guid("7de58bfe6f61410398c7d6632f7b9169")
@WinRTInterface("7de58bfe6f61410398c7d6632f7b9169")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILampArrayEffectPlaylist.ByReference::class)
public interface ILampArrayEffectPlaylist : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Append(effect: ILampArrayEffect?): Unit

  @InterfaceMethod(1)
  public fun OverrideZIndex(zIndex: Int): Unit

  @InterfaceMethod(2)
  public fun Start(): Unit

  @InterfaceMethod(3)
  public fun Stop(): Unit

  @InterfaceMethod(4)
  public fun Pause(): Unit

  @InterfaceMethod(5)
  public fun get_EffectStartMode(): LampArrayEffectStartMode?

  @InterfaceMethod(6)
  public fun put_EffectStartMode(value: LampArrayEffectStartMode?): Unit

  @InterfaceMethod(7)
  public fun get_Occurrences(): Int

  @InterfaceMethod(8)
  public fun put_Occurrences(value: Int): Unit

  @InterfaceMethod(9)
  public fun get_RepetitionMode(): LampArrayRepetitionMode?

  @InterfaceMethod(10)
  public fun put_RepetitionMode(value: LampArrayRepetitionMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILampArrayEffectPlaylist> {
    public override fun getValue() = ABI.makeILampArrayEffectPlaylist(pointer.getPointer(0))

    public fun setValue(value: ILampArrayEffectPlaylist_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILampArrayEffectPlaylist {
    public val __995910184_Ptr: Pointer?

    public val _995910184_VtblPtr: Pointer?
      get() = __995910184_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Append(effect: ILampArrayEffect?): Unit {
      val fnPtr = _995910184_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__995910184_Ptr, marshalToNative(effect),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun OverrideZIndex(zIndex: Int): Unit {
      val fnPtr = _995910184_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__995910184_Ptr, zIndex,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Start(): Unit {
      val fnPtr = _995910184_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__995910184_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun Stop(): Unit {
      val fnPtr = _995910184_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__995910184_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Pause(): Unit {
      val fnPtr = _995910184_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__995910184_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_EffectStartMode(): LampArrayEffectStartMode? {
      val fnPtr = _995910184_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LampArrayEffectStartMode>()
      val hr = fn.invokeHR(arrayOf(__995910184_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LampArrayEffectStartMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_EffectStartMode(value: LampArrayEffectStartMode?): Unit {
      val fnPtr = _995910184_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__995910184_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Occurrences(): Int {
      val fnPtr = _995910184_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__995910184_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_Occurrences(value: Int): Unit {
      val fnPtr = _995910184_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__995910184_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_RepetitionMode(): LampArrayRepetitionMode? {
      val fnPtr = _995910184_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LampArrayRepetitionMode>()
      val hr = fn.invokeHR(arrayOf(__995910184_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LampArrayRepetitionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_RepetitionMode(value: LampArrayRepetitionMode?): Unit {
      val fnPtr = _995910184_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__995910184_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILampArrayEffectPlaylist_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __995910184_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILampArrayEffectPlaylist, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7de58bfe6f61410398c7d6632f7b9169")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILampArrayEffectPlaylist(ptr: Pointer?): WithDefault =
        ILampArrayEffectPlaylist_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILampArrayEffectPlaylist {
      val address = segment.toRawLongValue()
      return makeILampArrayEffectPlaylist(Pointer(address))
    }

    public override fun toNative(obj: ILampArrayEffectPlaylist): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__995910184_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILampArrayEffectPlaylist):
        Array<ILampArrayEffectPlaylist?> = (elements as
        Array<ILampArrayEffectPlaylist?>).castToImpl<ILampArrayEffectPlaylist,ILampArrayEffectPlaylist_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILampArrayEffectPlaylist?> =
        arrayOfNulls<ILampArrayEffectPlaylist_Impl>(size) as Array<ILampArrayEffectPlaylist?>
  }
}
