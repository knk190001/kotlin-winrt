package Windows.ApplicationModel.Background

import Windows.Foundation.Collections.IMapView
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

@ABIMarker(IBackgroundTaskRegistrationStatics2.ABI::class)
@Signature("{174b671e-b20d-4fa9-ad9a-e93ad6c71e01}")
@Guid("174b671eb20d4fa9ad9ae93ad6c71e01")
@WinRTInterface("174b671eb20d4fa9ad9ae93ad6c71e01")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTaskRegistrationStatics2.ByReference::class)
public interface IBackgroundTaskRegistrationStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllTaskGroups(): IMapView<String?, BackgroundTaskRegistrationGroup?>?

  @InterfaceMethod(1)
  public fun GetTaskGroup(groupId: String?): BackgroundTaskRegistrationGroup?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTaskRegistrationStatics2> {
    public override fun getValue() =
        ABI.makeIBackgroundTaskRegistrationStatics2(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTaskRegistrationStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTaskRegistrationStatics2 {
    public val __2089372426_Ptr: Pointer?

    public val _2089372426_VtblPtr: Pointer?
      get() = __2089372426_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllTaskGroups(): IMapView<String?, BackgroundTaskRegistrationGroup?>? {
      val fnPtr = _2089372426_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, BackgroundTaskRegistrationGroup?>>()
      val hr = fn.invokeHR(arrayOf(__2089372426_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?,
          BackgroundTaskRegistrationGroup?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetTaskGroup(groupId: String?): BackgroundTaskRegistrationGroup? {
      val fnPtr = _2089372426_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundTaskRegistrationGroup>()
      val hr = fn.invokeHR(arrayOf(__2089372426_Ptr, marshalToNative(groupId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundTaskRegistrationGroup>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundTaskRegistrationStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2089372426_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTaskRegistrationStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("174b671eb20d4fa9ad9ae93ad6c71e01")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTaskRegistrationStatics2(ptr: Pointer?): WithDefault =
        IBackgroundTaskRegistrationStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTaskRegistrationStatics2 {
      val address = segment.toRawLongValue()
      return makeIBackgroundTaskRegistrationStatics2(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTaskRegistrationStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2089372426_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTaskRegistrationStatics2):
        Array<IBackgroundTaskRegistrationStatics2?> = (elements as
        Array<IBackgroundTaskRegistrationStatics2?>).castToImpl<IBackgroundTaskRegistrationStatics2,IBackgroundTaskRegistrationStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTaskRegistrationStatics2?> =
        arrayOfNulls<IBackgroundTaskRegistrationStatics2_Impl>(size) as
        Array<IBackgroundTaskRegistrationStatics2?>
  }
}
