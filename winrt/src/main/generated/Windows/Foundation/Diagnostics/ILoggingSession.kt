package Windows.Foundation.Diagnostics

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Storage.IStorageFolder
import Windows.Storage.StorageFile
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ILoggingSession.ABI::class)
@Signature("{6221f306-9380-4ad7-baf5-41ea9310d768}")
@Guid("6221f30693804ad7baf541ea9310d768")
@WinRTInterface("6221f30693804ad7baf541ea9310d768")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoggingSession.ByReference::class)
public interface ILoggingSession : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun SaveToFileAsync(folder: IStorageFolder?, fileName: String?):
      IAsyncOperation<StorageFile?>?

  @InterfaceMethod(2)
  public fun AddLoggingChannel(loggingChannel: ILoggingChannel?): Unit

  @InterfaceMethod(3)
  public fun AddLoggingChannel(loggingChannel: ILoggingChannel?, maxLevel: LoggingLevel?): Unit

  @InterfaceMethod(4)
  public fun RemoveLoggingChannel(loggingChannel: ILoggingChannel?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoggingSession> {
    public override fun getValue() = ABI.makeILoggingSession(pointer.getPointer(0))

    public fun setValue(value: ILoggingSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoggingSession, IClosable.WithDefault {
    public val __1090824572_Ptr: Pointer?

    public val _1090824572_VtblPtr: Pointer?
      get() = __1090824572_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _1090824572_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1090824572_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SaveToFileAsync(folder: IStorageFolder?, fileName: String?):
        IAsyncOperation<StorageFile?>? {
      val fnPtr = _1090824572_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__1090824572_Ptr, marshalToNative(folder),
          marshalToNative(fileName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun AddLoggingChannel(loggingChannel: ILoggingChannel?): Unit {
      val fnPtr = _1090824572_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1090824572_Ptr, marshalToNative(loggingChannel),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun AddLoggingChannel(loggingChannel: ILoggingChannel?,
        maxLevel: LoggingLevel?): Unit {
      val fnPtr = _1090824572_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1090824572_Ptr, marshalToNative(loggingChannel),
          marshalToNative(maxLevel),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun RemoveLoggingChannel(loggingChannel: ILoggingChannel?): Unit {
      val fnPtr = _1090824572_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1090824572_Ptr, marshalToNative(loggingChannel),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILoggingSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1090824572_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1090824572_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoggingSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6221f30693804ad7baf541ea9310d768")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoggingSession(ptr: Pointer?): WithDefault = ILoggingSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoggingSession {
      val address = segment.toRawLongValue()
      return makeILoggingSession(Pointer(address))
    }

    public override fun toNative(obj: ILoggingSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1090824572_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoggingSession): Array<ILoggingSession?> = (elements as
        Array<ILoggingSession?>).castToImpl<ILoggingSession,ILoggingSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoggingSession?> =
        arrayOfNulls<ILoggingSession_Impl>(size) as Array<ILoggingSession?>
  }
}
