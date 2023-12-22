package Microsoft.Windows.AppNotifications

import Windows.Foundation.Uri
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

@ABIMarker(IAppNotificationManager2.ABI::class)
@Signature("{38ba268d-e0c7-522e-a79d-8a29dcdd7135}")
@Guid("38ba268de0c7522ea79d8a29dcdd7135")
@WinRTInterface("38ba268de0c7522ea79d8a29dcdd7135")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppNotificationManager2.ByReference::class)
public interface IAppNotificationManager2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Register(displayName: String?, iconUri: Uri?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppNotificationManager2> {
    public override fun getValue() = ABI.makeIAppNotificationManager2(pointer.getPointer(0))

    public fun setValue(value: IAppNotificationManager2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppNotificationManager2 {
    public val __1965276442_Ptr: Pointer?

    public val _1965276442_VtblPtr: Pointer?
      get() = __1965276442_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Register(displayName: String?, iconUri: Uri?): Unit {
      val fnPtr = _1965276442_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1965276442_Ptr, marshalToNative(displayName),
          marshalToNative(iconUri),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppNotificationManager2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1965276442_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppNotificationManager2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("38ba268de0c7522ea79d8a29dcdd7135")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppNotificationManager2(ptr: Pointer?): WithDefault =
        IAppNotificationManager2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppNotificationManager2 {
      val address = segment.toRawLongValue()
      return makeIAppNotificationManager2(Pointer(address))
    }

    public override fun toNative(obj: IAppNotificationManager2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1965276442_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppNotificationManager2):
        Array<IAppNotificationManager2?> = (elements as
        Array<IAppNotificationManager2?>).castToImpl<IAppNotificationManager2,IAppNotificationManager2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppNotificationManager2?> =
        arrayOfNulls<IAppNotificationManager2_Impl>(size) as Array<IAppNotificationManager2?>
  }
}
