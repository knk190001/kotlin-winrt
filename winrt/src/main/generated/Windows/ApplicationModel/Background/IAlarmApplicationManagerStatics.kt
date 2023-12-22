package Windows.ApplicationModel.Background

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IAlarmApplicationManagerStatics.ABI::class)
@Signature("{ca03fa3b-cce6-4de2-b09b-9628bd33bbbe}")
@Guid("ca03fa3bcce64de2b09b9628bd33bbbe")
@WinRTInterface("ca03fa3bcce64de2b09b9628bd33bbbe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAlarmApplicationManagerStatics.ByReference::class)
public interface IAlarmApplicationManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestAccessAsync(): IAsyncOperation<AlarmAccessStatus?>?

  @InterfaceMethod(1)
  public fun GetAccessStatus(): AlarmAccessStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAlarmApplicationManagerStatics> {
    public override fun getValue() = ABI.makeIAlarmApplicationManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IAlarmApplicationManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAlarmApplicationManagerStatics {
    public val __79282776_Ptr: Pointer?

    public val _79282776_VtblPtr: Pointer?
      get() = __79282776_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestAccessAsync(): IAsyncOperation<AlarmAccessStatus?>? {
      val fnPtr = _79282776_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AlarmAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__79282776_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AlarmAccessStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetAccessStatus(): AlarmAccessStatus? {
      val fnPtr = _79282776_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AlarmAccessStatus>()
      val hr = fn.invokeHR(arrayOf(__79282776_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AlarmAccessStatus>(result.getValue())
      return resultValue
    }
  }

  public class IAlarmApplicationManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __79282776_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAlarmApplicationManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ca03fa3bcce64de2b09b9628bd33bbbe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAlarmApplicationManagerStatics(ptr: Pointer?): WithDefault =
        IAlarmApplicationManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAlarmApplicationManagerStatics {
      val address = segment.toRawLongValue()
      return makeIAlarmApplicationManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IAlarmApplicationManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__79282776_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAlarmApplicationManagerStatics):
        Array<IAlarmApplicationManagerStatics?> = (elements as
        Array<IAlarmApplicationManagerStatics?>).castToImpl<IAlarmApplicationManagerStatics,IAlarmApplicationManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAlarmApplicationManagerStatics?> =
        arrayOfNulls<IAlarmApplicationManagerStatics_Impl>(size) as
        Array<IAlarmApplicationManagerStatics?>
  }
}
