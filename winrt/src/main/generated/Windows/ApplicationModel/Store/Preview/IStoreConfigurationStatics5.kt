package Windows.ApplicationModel.Store.Preview

import Windows.System.User
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

@ABIMarker(IStoreConfigurationStatics5.ABI::class)
@Signature("{f7613191-8fa9-49db-822b-0160e7e4e5c5}")
@Guid("f76131918fa949db822b0160e7e4e5c5")
@WinRTInterface("f76131918fa949db822b0160e7e4e5c5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreConfigurationStatics5.ByReference::class)
public interface IStoreConfigurationStatics5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsPinToDesktopSupported(): Boolean

  @InterfaceMethod(1)
  public fun IsPinToTaskbarSupported(): Boolean

  @InterfaceMethod(2)
  public fun IsPinToStartSupported(): Boolean

  @InterfaceMethod(3)
  public fun PinToDesktop(appPackageFamilyName: String?): Unit

  @InterfaceMethod(4)
  public fun PinToDesktopForUser(user: User?, appPackageFamilyName: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreConfigurationStatics5> {
    public override fun getValue() = ABI.makeIStoreConfigurationStatics5(pointer.getPointer(0))

    public fun setValue(value: IStoreConfigurationStatics5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreConfigurationStatics5 {
    public val __139180861_Ptr: Pointer?

    public val _139180861_VtblPtr: Pointer?
      get() = __139180861_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsPinToDesktopSupported(): Boolean {
      val fnPtr = _139180861_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__139180861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun IsPinToTaskbarSupported(): Boolean {
      val fnPtr = _139180861_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__139180861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun IsPinToStartSupported(): Boolean {
      val fnPtr = _139180861_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__139180861_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun PinToDesktop(appPackageFamilyName: String?): Unit {
      val fnPtr = _139180861_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__139180861_Ptr, marshalToNative(appPackageFamilyName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun PinToDesktopForUser(user: User?, appPackageFamilyName: String?): Unit {
      val fnPtr = _139180861_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__139180861_Ptr, marshalToNative(user),
          marshalToNative(appPackageFamilyName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStoreConfigurationStatics5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __139180861_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreConfigurationStatics5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f76131918fa949db822b0160e7e4e5c5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreConfigurationStatics5(ptr: Pointer?): WithDefault =
        IStoreConfigurationStatics5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreConfigurationStatics5 {
      val address = segment.toRawLongValue()
      return makeIStoreConfigurationStatics5(Pointer(address))
    }

    public override fun toNative(obj: IStoreConfigurationStatics5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__139180861_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreConfigurationStatics5):
        Array<IStoreConfigurationStatics5?> = (elements as
        Array<IStoreConfigurationStatics5?>).castToImpl<IStoreConfigurationStatics5,IStoreConfigurationStatics5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreConfigurationStatics5?> =
        arrayOfNulls<IStoreConfigurationStatics5_Impl>(size) as Array<IStoreConfigurationStatics5?>
  }
}
