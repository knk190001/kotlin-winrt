package Windows.ApplicationModel.DataTransfer

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

@ABIMarker(IDataTransferManagerStatics.ABI::class)
@Signature("{a9da01aa-e00e-4cfe-aa44-2dd932dca3d8}")
@Guid("a9da01aae00e4cfeaa442dd932dca3d8")
@WinRTInterface("a9da01aae00e4cfeaa442dd932dca3d8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataTransferManagerStatics.ByReference::class)
public interface IDataTransferManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ShowShareUI(): Unit

  @InterfaceMethod(1)
  public fun GetForCurrentView(): DataTransferManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataTransferManagerStatics> {
    public override fun getValue() = ABI.makeIDataTransferManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IDataTransferManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataTransferManagerStatics {
    public val __2039915703_Ptr: Pointer?

    public val _2039915703_VtblPtr: Pointer?
      get() = __2039915703_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowShareUI(): Unit {
      val fnPtr = _2039915703_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2039915703_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun GetForCurrentView(): DataTransferManager? {
      val fnPtr = _2039915703_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTransferManager>()
      val hr = fn.invokeHR(arrayOf(__2039915703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTransferManager>(result.getValue())
      return resultValue
    }
  }

  public class IDataTransferManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2039915703_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataTransferManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a9da01aae00e4cfeaa442dd932dca3d8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataTransferManagerStatics(ptr: Pointer?): WithDefault =
        IDataTransferManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataTransferManagerStatics {
      val address = segment.toRawLongValue()
      return makeIDataTransferManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IDataTransferManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2039915703_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataTransferManagerStatics):
        Array<IDataTransferManagerStatics?> = (elements as
        Array<IDataTransferManagerStatics?>).castToImpl<IDataTransferManagerStatics,IDataTransferManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataTransferManagerStatics?> =
        arrayOfNulls<IDataTransferManagerStatics_Impl>(size) as Array<IDataTransferManagerStatics?>
  }
}
