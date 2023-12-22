package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IAnimatedVisual.ABI.IID
import Windows.Foundation.IClosable
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

@ABIMarker(IAnimatedVisual2.ABI::class)
@Signature("{763a3f0b-95cc-59ef-9890-147868599de9}")
@Guid("763a3f0b95cc59ef9890147868599de9")
@WinRTInterface("763a3f0b95cc59ef9890147868599de9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimatedVisual2.ByReference::class)
public interface IAnimatedVisual2 : NativeMapped, IWinRTInterface, IAnimatedVisual, IClosable {
  @InterfaceMethod(0)
  public fun CreateAnimations(): Unit

  @InterfaceMethod(1)
  public fun DestroyAnimations(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimatedVisual2> {
    public override fun getValue() = ABI.makeIAnimatedVisual2(pointer.getPointer(0))

    public fun setValue(value: IAnimatedVisual2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimatedVisual2, IAnimatedVisual.WithDefault,
      IClosable.WithDefault {
    public val __1699918552_Ptr: Pointer?

    public val _1699918552_VtblPtr: Pointer?
      get() = __1699918552_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateAnimations(): Unit {
      val fnPtr = _1699918552_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1699918552_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun DestroyAnimations(): Unit {
      val fnPtr = _1699918552_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1699918552_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAnimatedVisual2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAnimatedVisual, IClosable {
    public override val __2023373898_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1699918552_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1699918552_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1699918552_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimatedVisual2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("763a3f0b95cc59ef9890147868599de9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimatedVisual2(ptr: Pointer?): WithDefault = IAnimatedVisual2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimatedVisual2 {
      val address = segment.toRawLongValue()
      return makeIAnimatedVisual2(Pointer(address))
    }

    public override fun toNative(obj: IAnimatedVisual2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1699918552_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimatedVisual2): Array<IAnimatedVisual2?> = (elements as
        Array<IAnimatedVisual2?>).castToImpl<IAnimatedVisual2,IAnimatedVisual2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimatedVisual2?> =
        arrayOfNulls<IAnimatedVisual2_Impl>(size) as Array<IAnimatedVisual2?>
  }
}
