package Windows.Foundation

import Windows.Foundation.IClosable.ABI.IID
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

@ABIMarker(IDeferral.ABI::class)
@Signature("{d6269732-3b7f-46a7-b40b-4fdca2a2c693}")
@Guid("d62697323b7f46a7b40b4fdca2a2c693")
@WinRTInterface("d62697323b7f46a7b40b4fdca2a2c693")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeferral.ByReference::class)
public interface IDeferral : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDeferral> {
    public override fun getValue() = ABI.makeIDeferral(pointer.getPointer(0))

    public fun setValue(value: IDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeferral, IClosable.WithDefault {
    public val __1705435306_Ptr: Pointer?

    public val _1705435306_VtblPtr: Pointer?
      get() = __1705435306_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _1705435306_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1705435306_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1705435306_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1705435306_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d62697323b7f46a7b40b4fdca2a2c693")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeferral(ptr: Pointer?): WithDefault = IDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeferral {
      val address = segment.toRawLongValue()
      return makeIDeferral(Pointer(address))
    }

    public override fun toNative(obj: IDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1705435306_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeferral): Array<IDeferral?> = (elements as
        Array<IDeferral?>).castToImpl<IDeferral,IDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeferral?> = arrayOfNulls<IDeferral_Impl>(size)
        as Array<IDeferral?>
  }
}
