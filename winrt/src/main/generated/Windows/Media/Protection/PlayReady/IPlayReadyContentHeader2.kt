package Windows.Media.Protection.PlayReady

import Windows.Media.Protection.PlayReady.IPlayReadyContentHeader.ABI.IID
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

@ABIMarker(IPlayReadyContentHeader2.ABI::class)
@Signature("{359c79f4-2180-498c-965b-e754d875eab2}")
@Guid("359c79f42180498c965be754d875eab2")
@WinRTInterface("359c79f42180498c965be754d875eab2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyContentHeader2.ByReference::class)
public interface IPlayReadyContentHeader2 : NativeMapped, IWinRTInterface, IPlayReadyContentHeader {
  @InterfaceMethod(0)
  public fun get_KeyIds(): Array<com.sun.jna.platform.win32.Guid.GUID?>?

  @InterfaceMethod(1)
  public fun get_KeyIdStrings(): Array<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyContentHeader2> {
    public override fun getValue() = ABI.makeIPlayReadyContentHeader2(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyContentHeader2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyContentHeader2, IPlayReadyContentHeader.WithDefault {
    public val __1628135935_Ptr: Pointer?

    public val _1628135935_VtblPtr: Pointer?
      get() = __1628135935_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyIds(): Array<com.sun.jna.platform.win32.Guid.GUID?>? {
      val fnPtr = _1628135935_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1628135935_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_KeyIdStrings(): Array<String?>? {
      val fnPtr = _1628135935_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<String>()
      val hr = fn.invokeHR(arrayOf(__1628135935_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }
  }

  public class IPlayReadyContentHeader2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPlayReadyContentHeader {
    public override val __640216145_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1628135935_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1628135935_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyContentHeader2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("359c79f42180498c965be754d875eab2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyContentHeader2(ptr: Pointer?): WithDefault =
        IPlayReadyContentHeader2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyContentHeader2 {
      val address = segment.toRawLongValue()
      return makeIPlayReadyContentHeader2(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyContentHeader2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1628135935_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyContentHeader2):
        Array<IPlayReadyContentHeader2?> = (elements as
        Array<IPlayReadyContentHeader2?>).castToImpl<IPlayReadyContentHeader2,IPlayReadyContentHeader2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyContentHeader2?> =
        arrayOfNulls<IPlayReadyContentHeader2_Impl>(size) as Array<IPlayReadyContentHeader2?>
  }
}
