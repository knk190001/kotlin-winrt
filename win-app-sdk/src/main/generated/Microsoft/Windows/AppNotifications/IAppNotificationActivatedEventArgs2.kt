package Microsoft.Windows.AppNotifications

import Windows.Foundation.Collections.IMap
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

@ABIMarker(IAppNotificationActivatedEventArgs2.ABI::class)
@Signature("{52c06b9b-2c50-5037-9416-a3be47b9d5bd}")
@Guid("52c06b9b2c5050379416a3be47b9d5bd")
@WinRTInterface("52c06b9b2c5050379416a3be47b9d5bd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppNotificationActivatedEventArgs2.ByReference::class)
public interface IAppNotificationActivatedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Arguments(): IMap<String?, String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppNotificationActivatedEventArgs2> {
    public override fun getValue() =
        ABI.makeIAppNotificationActivatedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IAppNotificationActivatedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppNotificationActivatedEventArgs2 {
    public val __959808745_Ptr: Pointer?

    public val _959808745_VtblPtr: Pointer?
      get() = __959808745_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Arguments(): IMap<String?, String?>? {
      val fnPtr = _959808745_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__959808745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, String?>>(result.getValue())
      return resultValue
    }
  }

  public class IAppNotificationActivatedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __959808745_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppNotificationActivatedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("52c06b9b2c5050379416a3be47b9d5bd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppNotificationActivatedEventArgs2(ptr: Pointer?): WithDefault =
        IAppNotificationActivatedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppNotificationActivatedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIAppNotificationActivatedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IAppNotificationActivatedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__959808745_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppNotificationActivatedEventArgs2):
        Array<IAppNotificationActivatedEventArgs2?> = (elements as
        Array<IAppNotificationActivatedEventArgs2?>).castToImpl<IAppNotificationActivatedEventArgs2,IAppNotificationActivatedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppNotificationActivatedEventArgs2?> =
        arrayOfNulls<IAppNotificationActivatedEventArgs2_Impl>(size) as
        Array<IAppNotificationActivatedEventArgs2?>
  }
}
