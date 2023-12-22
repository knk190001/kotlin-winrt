package Windows.ApplicationModel.Contacts

import Windows.ApplicationModel.Contacts.IContactWebsite.ABI.IID
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

@ABIMarker(IContactWebsite2.ABI::class)
@Signature("{f87ee91e-5647-4068-bb5e-4b6f437ce308}")
@Guid("f87ee91e56474068bb5e4b6f437ce308")
@WinRTInterface("f87ee91e56474068bb5e4b6f437ce308")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactWebsite2.ByReference::class)
public interface IContactWebsite2 : NativeMapped, IWinRTInterface, IContactWebsite {
  @InterfaceMethod(0)
  public fun get_RawValue(): String?

  @InterfaceMethod(1)
  public fun put_RawValue(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactWebsite2> {
    public override fun getValue() = ABI.makeIContactWebsite2(pointer.getPointer(0))

    public fun setValue(value: IContactWebsite2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactWebsite2, IContactWebsite.WithDefault {
    public val __712130357_Ptr: Pointer?

    public val _712130357_VtblPtr: Pointer?
      get() = __712130357_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RawValue(): String? {
      val fnPtr = _712130357_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__712130357_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_RawValue(value: String?): Unit {
      val fnPtr = _712130357_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__712130357_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactWebsite2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IContactWebsite {
    public override val __438613945_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_712130357_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __712130357_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactWebsite2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f87ee91e56474068bb5e4b6f437ce308")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactWebsite2(ptr: Pointer?): WithDefault = IContactWebsite2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactWebsite2 {
      val address = segment.toRawLongValue()
      return makeIContactWebsite2(Pointer(address))
    }

    public override fun toNative(obj: IContactWebsite2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__712130357_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactWebsite2): Array<IContactWebsite2?> = (elements as
        Array<IContactWebsite2?>).castToImpl<IContactWebsite2,IContactWebsite2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactWebsite2?> =
        arrayOfNulls<IContactWebsite2_Impl>(size) as Array<IContactWebsite2?>
  }
}
