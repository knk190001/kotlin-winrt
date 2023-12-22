package Windows.Media.Capture

import Windows.Storage.Streams.IRandomAccessStreamReference
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

@ABIMarker(IAppBroadcastPlugIn.ABI::class)
@Signature("{520c1e66-6513-4574-ac54-23b79729615b}")
@Guid("520c1e6665134574ac5423b79729615b")
@WinRTInterface("520c1e6665134574ac5423b79729615b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastPlugIn.ByReference::class)
public interface IAppBroadcastPlugIn : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppId(): String?

  @InterfaceMethod(1)
  public fun get_ProviderSettings(): AppBroadcastProviderSettings?

  @InterfaceMethod(2)
  public fun get_Logo(): IRandomAccessStreamReference?

  @InterfaceMethod(3)
  public fun get_DisplayName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastPlugIn> {
    public override fun getValue() = ABI.makeIAppBroadcastPlugIn(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastPlugIn_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastPlugIn {
    public val __1419616491_Ptr: Pointer?

    public val _1419616491_VtblPtr: Pointer?
      get() = __1419616491_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppId(): String? {
      val fnPtr = _1419616491_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1419616491_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ProviderSettings(): AppBroadcastProviderSettings? {
      val fnPtr = _1419616491_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastProviderSettings>()
      val hr = fn.invokeHR(arrayOf(__1419616491_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastProviderSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Logo(): IRandomAccessStreamReference? {
      val fnPtr = _1419616491_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__1419616491_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1419616491_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1419616491_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAppBroadcastPlugIn_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1419616491_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastPlugIn, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("520c1e6665134574ac5423b79729615b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastPlugIn(ptr: Pointer?): WithDefault = IAppBroadcastPlugIn_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastPlugIn {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastPlugIn(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastPlugIn): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1419616491_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastPlugIn): Array<IAppBroadcastPlugIn?> =
        (elements as
        Array<IAppBroadcastPlugIn?>).castToImpl<IAppBroadcastPlugIn,IAppBroadcastPlugIn_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastPlugIn?> =
        arrayOfNulls<IAppBroadcastPlugIn_Impl>(size) as Array<IAppBroadcastPlugIn?>
  }
}
