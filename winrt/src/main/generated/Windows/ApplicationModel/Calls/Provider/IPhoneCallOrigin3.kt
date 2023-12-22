package Windows.ApplicationModel.Calls.Provider

import Windows.ApplicationModel.Calls.Provider.IPhoneCallOrigin2.ABI.IID
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneCallOrigin3.ABI::class)
@Signature("{49330fb4-d1a7-43a2-aeee-c07b6dbaf068}")
@Guid("49330fb4d1a743a2aeeec07b6dbaf068")
@WinRTInterface("49330fb4d1a743a2aeeec07b6dbaf068")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallOrigin3.ByReference::class)
public interface IPhoneCallOrigin3 : NativeMapped, IWinRTInterface, IPhoneCallOrigin2,
    IPhoneCallOrigin {
  @InterfaceMethod(0)
  public fun get_DisplayPicture(): StorageFile?

  @InterfaceMethod(1)
  public fun put_DisplayPicture(value: StorageFile?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallOrigin3> {
    public override fun getValue() = ABI.makeIPhoneCallOrigin3(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallOrigin3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallOrigin3, IPhoneCallOrigin2.WithDefault,
      IPhoneCallOrigin.WithDefault {
    public val __1175756502_Ptr: Pointer?

    public val _1175756502_VtblPtr: Pointer?
      get() = __1175756502_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayPicture(): StorageFile? {
      val fnPtr = _1175756502_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFile>()
      val hr = fn.invokeHR(arrayOf(__1175756502_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DisplayPicture(value: StorageFile?): Unit {
      val fnPtr = _1175756502_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1175756502_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPhoneCallOrigin3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPhoneCallOrigin2,
      IPhoneCallOrigin {
    public override val __1175756501_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1175756502_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1700495613_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IPhoneCallOrigin.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1175756502_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1175756502_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallOrigin3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("49330fb4d1a743a2aeeec07b6dbaf068")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallOrigin3(ptr: Pointer?): WithDefault = IPhoneCallOrigin3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallOrigin3 {
      val address = segment.toRawLongValue()
      return makeIPhoneCallOrigin3(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallOrigin3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1175756502_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallOrigin3): Array<IPhoneCallOrigin3?> = (elements
        as Array<IPhoneCallOrigin3?>).castToImpl<IPhoneCallOrigin3,IPhoneCallOrigin3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallOrigin3?> =
        arrayOfNulls<IPhoneCallOrigin3_Impl>(size) as Array<IPhoneCallOrigin3?>
  }
}
