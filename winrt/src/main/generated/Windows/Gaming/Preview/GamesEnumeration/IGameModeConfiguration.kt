package Windows.Gaming.Preview.GamesEnumeration

import Windows.Foundation.Collections.IVector
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IReference
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGameModeConfiguration.ABI::class)
@Signature("{78e591af-b142-4ef0-8830-55bc2be4f5ea}")
@Guid("78e591afb1424ef0883055bc2be4f5ea")
@WinRTInterface("78e591afb1424ef0883055bc2be4f5ea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameModeConfiguration.ByReference::class)
public interface IGameModeConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_RelatedProcessNames(): IVector<String?>?

  @InterfaceMethod(3)
  public fun get_PercentGpuTimeAllocatedToGame(): IReference<Int>?

  @InterfaceMethod(4)
  public fun put_PercentGpuTimeAllocatedToGame(value: IReference<Int>?): Unit

  @InterfaceMethod(5)
  public fun get_PercentGpuMemoryAllocatedToGame(): IReference<Int>?

  @InterfaceMethod(6)
  public fun put_PercentGpuMemoryAllocatedToGame(value: IReference<Int>?): Unit

  @InterfaceMethod(7)
  public fun get_PercentGpuMemoryAllocatedToSystemCompositor(): IReference<Int>?

  @InterfaceMethod(8)
  public fun put_PercentGpuMemoryAllocatedToSystemCompositor(value: IReference<Int>?): Unit

  @InterfaceMethod(9)
  public fun get_MaxCpuCount(): IReference<Int>?

  @InterfaceMethod(10)
  public fun put_MaxCpuCount(value: IReference<Int>?): Unit

  @InterfaceMethod(11)
  public fun get_CpuExclusivityMaskLow(): IReference<Int>?

  @InterfaceMethod(12)
  public fun put_CpuExclusivityMaskLow(value: IReference<Int>?): Unit

  @InterfaceMethod(13)
  public fun get_CpuExclusivityMaskHigh(): IReference<Int>?

  @InterfaceMethod(14)
  public fun put_CpuExclusivityMaskHigh(value: IReference<Int>?): Unit

  @InterfaceMethod(15)
  public fun get_AffinitizeToExclusiveCpus(): Boolean

  @InterfaceMethod(16)
  public fun put_AffinitizeToExclusiveCpus(value: Boolean): Unit

  @InterfaceMethod(17)
  public fun SaveAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameModeConfiguration> {
    public override fun getValue() = ABI.makeIGameModeConfiguration(pointer.getPointer(0))

    public fun setValue(value: IGameModeConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameModeConfiguration {
    public val __1519930088_Ptr: Pointer?

    public val _1519930088_VtblPtr: Pointer?
      get() = __1519930088_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _1519930088_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1519930088_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsEnabled(value: Boolean): Unit {
      val fnPtr = _1519930088_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1519930088_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_RelatedProcessNames(): IVector<String?>? {
      val fnPtr = _1519930088_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1519930088_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PercentGpuTimeAllocatedToGame(): IReference<Int>? {
      val fnPtr = _1519930088_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1519930088_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_PercentGpuTimeAllocatedToGame(value: IReference<Int>?): Unit {
      val fnPtr = _1519930088_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1519930088_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_PercentGpuMemoryAllocatedToGame(): IReference<Int>? {
      val fnPtr = _1519930088_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1519930088_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_PercentGpuMemoryAllocatedToGame(value: IReference<Int>?): Unit {
      val fnPtr = _1519930088_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1519930088_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_PercentGpuMemoryAllocatedToSystemCompositor(): IReference<Int>? {
      val fnPtr = _1519930088_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1519930088_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_PercentGpuMemoryAllocatedToSystemCompositor(value: IReference<Int>?):
        Unit {
      val fnPtr = _1519930088_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1519930088_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_MaxCpuCount(): IReference<Int>? {
      val fnPtr = _1519930088_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1519930088_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_MaxCpuCount(value: IReference<Int>?): Unit {
      val fnPtr = _1519930088_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1519930088_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_CpuExclusivityMaskLow(): IReference<Int>? {
      val fnPtr = _1519930088_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1519930088_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_CpuExclusivityMaskLow(value: IReference<Int>?): Unit {
      val fnPtr = _1519930088_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1519930088_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_CpuExclusivityMaskHigh(): IReference<Int>? {
      val fnPtr = _1519930088_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1519930088_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_CpuExclusivityMaskHigh(value: IReference<Int>?): Unit {
      val fnPtr = _1519930088_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1519930088_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_AffinitizeToExclusiveCpus(): Boolean {
      val fnPtr = _1519930088_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1519930088_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun put_AffinitizeToExclusiveCpus(value: Boolean): Unit {
      val fnPtr = _1519930088_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1519930088_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun SaveAsync(): IAsyncAction? {
      val fnPtr = _1519930088_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1519930088_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IGameModeConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1519930088_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameModeConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("78e591afb1424ef0883055bc2be4f5ea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameModeConfiguration(ptr: Pointer?): WithDefault =
        IGameModeConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameModeConfiguration {
      val address = segment.toRawLongValue()
      return makeIGameModeConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IGameModeConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1519930088_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameModeConfiguration): Array<IGameModeConfiguration?> =
        (elements as
        Array<IGameModeConfiguration?>).castToImpl<IGameModeConfiguration,IGameModeConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameModeConfiguration?> =
        arrayOfNulls<IGameModeConfiguration_Impl>(size) as Array<IGameModeConfiguration?>
  }
}
