package Windows.Devices.AllJoyn

import Windows.Foundation.IAsyncOperation
import Windows.Globalization.Language
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IAllJoynAboutDataViewStatics.ABI::class)
@Signature("{57edb688-0c5e-416e-88b5-39b32d25c47d}")
@Guid("57edb6880c5e416e88b539b32d25c47d")
@WinRTInterface("57edb6880c5e416e88b539b32d25c47d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynAboutDataViewStatics.ByReference::class)
public interface IAllJoynAboutDataViewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDataBySessionPortAsync(
    uniqueName: String?,
    busAttachment: AllJoynBusAttachment?,
    sessionPort: WinDef.USHORT
  ): IAsyncOperation<AllJoynAboutDataView?>?

  @InterfaceMethod(1)
  public fun GetDataBySessionPortAsync(
    uniqueName: String?,
    busAttachment: AllJoynBusAttachment?,
    sessionPort: WinDef.USHORT,
    language: Language?
  ): IAsyncOperation<AllJoynAboutDataView?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynAboutDataViewStatics> {
    public override fun getValue() = ABI.makeIAllJoynAboutDataViewStatics(pointer.getPointer(0))

    public fun setValue(value: IAllJoynAboutDataViewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynAboutDataViewStatics {
    public val __805606150_Ptr: Pointer?

    public val _805606150_VtblPtr: Pointer?
      get() = __805606150_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDataBySessionPortAsync(
      uniqueName: String?,
      busAttachment: AllJoynBusAttachment?,
      sessionPort: WinDef.USHORT
    ): IAsyncOperation<AllJoynAboutDataView?>? {
      val fnPtr = _805606150_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AllJoynAboutDataView?>>()
      val hr = fn.invokeHR(arrayOf(__805606150_Ptr, marshalToNative(uniqueName),
          marshalToNative(busAttachment), sessionPort, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AllJoynAboutDataView?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDataBySessionPortAsync(
      uniqueName: String?,
      busAttachment: AllJoynBusAttachment?,
      sessionPort: WinDef.USHORT,
      language: Language?
    ): IAsyncOperation<AllJoynAboutDataView?>? {
      val fnPtr = _805606150_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AllJoynAboutDataView?>>()
      val hr = fn.invokeHR(arrayOf(__805606150_Ptr, marshalToNative(uniqueName),
          marshalToNative(busAttachment), sessionPort, marshalToNative(language), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AllJoynAboutDataView?>>(result.getValue())
      return resultValue
    }
  }

  public class IAllJoynAboutDataViewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __805606150_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynAboutDataViewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("57edb6880c5e416e88b539b32d25c47d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynAboutDataViewStatics(ptr: Pointer?): WithDefault =
        IAllJoynAboutDataViewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynAboutDataViewStatics {
      val address = segment.toRawLongValue()
      return makeIAllJoynAboutDataViewStatics(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynAboutDataViewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__805606150_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynAboutDataViewStatics):
        Array<IAllJoynAboutDataViewStatics?> = (elements as
        Array<IAllJoynAboutDataViewStatics?>).castToImpl<IAllJoynAboutDataViewStatics,IAllJoynAboutDataViewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynAboutDataViewStatics?> =
        arrayOfNulls<IAllJoynAboutDataViewStatics_Impl>(size) as
        Array<IAllJoynAboutDataViewStatics?>
  }
}
