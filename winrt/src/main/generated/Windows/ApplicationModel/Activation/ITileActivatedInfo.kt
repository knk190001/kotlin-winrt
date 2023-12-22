package Windows.ApplicationModel.Activation

import Windows.Foundation.Collections.IVectorView
import Windows.UI.Notifications.ShownTileNotification
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

@ABIMarker(ITileActivatedInfo.ABI::class)
@Signature("{80e4a3b1-3980-4f17-b738-89194e0b8f65}")
@Guid("80e4a3b139804f17b73889194e0b8f65")
@WinRTInterface("80e4a3b139804f17b73889194e0b8f65")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITileActivatedInfo.ByReference::class)
public interface ITileActivatedInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RecentlyShownNotifications(): IVectorView<ShownTileNotification?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITileActivatedInfo> {
    public override fun getValue() = ABI.makeITileActivatedInfo(pointer.getPointer(0))

    public fun setValue(value: ITileActivatedInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITileActivatedInfo {
    public val __2028063192_Ptr: Pointer?

    public val _2028063192_VtblPtr: Pointer?
      get() = __2028063192_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RecentlyShownNotifications(): IVectorView<ShownTileNotification?>? {
      val fnPtr = _2028063192_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ShownTileNotification?>>()
      val hr = fn.invokeHR(arrayOf(__2028063192_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ShownTileNotification?>>(result.getValue())
      return resultValue
    }
  }

  public class ITileActivatedInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2028063192_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITileActivatedInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("80e4a3b139804f17b73889194e0b8f65")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITileActivatedInfo(ptr: Pointer?): WithDefault = ITileActivatedInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITileActivatedInfo {
      val address = segment.toRawLongValue()
      return makeITileActivatedInfo(Pointer(address))
    }

    public override fun toNative(obj: ITileActivatedInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2028063192_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITileActivatedInfo): Array<ITileActivatedInfo?> =
        (elements as
        Array<ITileActivatedInfo?>).castToImpl<ITileActivatedInfo,ITileActivatedInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileActivatedInfo?> =
        arrayOfNulls<ITileActivatedInfo_Impl>(size) as Array<ITileActivatedInfo?>
  }
}
