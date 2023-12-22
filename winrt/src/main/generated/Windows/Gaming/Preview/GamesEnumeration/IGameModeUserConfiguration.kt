package Windows.Gaming.Preview.GamesEnumeration

import Windows.Foundation.Collections.IVector
import Windows.Foundation.IAsyncAction
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

@ABIMarker(IGameModeUserConfiguration.ABI::class)
@Signature("{72d34af4-756b-470f-a0c2-ba62a90795db}")
@Guid("72d34af4756b470fa0c2ba62a90795db")
@WinRTInterface("72d34af4756b470fa0c2ba62a90795db")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameModeUserConfiguration.ByReference::class)
public interface IGameModeUserConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_GamingRelatedProcessNames(): IVector<String?>?

  @InterfaceMethod(1)
  public fun SaveAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameModeUserConfiguration> {
    public override fun getValue() = ABI.makeIGameModeUserConfiguration(pointer.getPointer(0))

    public fun setValue(value: IGameModeUserConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameModeUserConfiguration {
    public val __1564727821_Ptr: Pointer?

    public val _1564727821_VtblPtr: Pointer?
      get() = __1564727821_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GamingRelatedProcessNames(): IVector<String?>? {
      val fnPtr = _1564727821_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1564727821_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SaveAsync(): IAsyncAction? {
      val fnPtr = _1564727821_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1564727821_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IGameModeUserConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1564727821_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameModeUserConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("72d34af4756b470fa0c2ba62a90795db")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameModeUserConfiguration(ptr: Pointer?): WithDefault =
        IGameModeUserConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameModeUserConfiguration {
      val address = segment.toRawLongValue()
      return makeIGameModeUserConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IGameModeUserConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1564727821_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameModeUserConfiguration):
        Array<IGameModeUserConfiguration?> = (elements as
        Array<IGameModeUserConfiguration?>).castToImpl<IGameModeUserConfiguration,IGameModeUserConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameModeUserConfiguration?> =
        arrayOfNulls<IGameModeUserConfiguration_Impl>(size) as Array<IGameModeUserConfiguration?>
  }
}
