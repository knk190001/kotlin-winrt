package Windows.Foundation

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.DynamicSignature
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.TypeHash
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance
import kotlin.reflect.KVariance.INVARIANT
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@GenericType
@DynamicSignature
@ABIMarker(IWwwFormUrlDecoderRuntimeClass.ABI::class)
@Guid("d45a0451f225454292960e1df5d254df")
@WinRTByReference(IWwwFormUrlDecoderRuntimeClass.ByReference::class)
@TypeHash("__1047768379_Type")
public interface IWwwFormUrlDecoderRuntimeClass : NativeMapped, IWinRTInterface,
    IIterable<IWwwFormUrlDecoderEntry?>, IVectorView<IWwwFormUrlDecoderEntry?> {
  public val __1047768379_Ptr: Pointer?

  public val _1047768379_VtblPtr: Pointer?
    get() = __1047768379_Ptr?.getPointer(0)

  public override val __1449643190_Type: KType
    get() = IIterable::class.createType(listOf(
      KTypeProjection(INVARIANT,IWwwFormUrlDecoderEntry::class.createType()),
    ))

  public override val __970637876_Type: KType
    get() = IVectorView::class.createType(listOf(
      KTypeProjection(INVARIANT,IWwwFormUrlDecoderEntry::class.createType()),
    ))

  public fun GetFirstValueByName(name: String?): String?

  public interface WithDefault : IWwwFormUrlDecoderRuntimeClass {
    public override fun GetFirstValueByName(name: String?): String? {
      val fnPtr = _1047768379_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1047768379_Ptr,marshalToNative(name),result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = String::class.createType()
      return marshalFromNative<String>(result.getValue(), returnType!!)
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWwwFormUrlDecoderRuntimeClass> {
    public override fun getValue(): IWwwFormUrlDecoderRuntimeClass =
        ABI.makeIWwwFormUrlDecoderRuntimeClass(pointer.getPointer(0))

    public fun setValue(value: IWwwFormUrlDecoderRuntimeClass): Unit {
      pointer = value.__1047768379_Ptr!!
    }
  }

  public class IWwwFormUrlDecoderRuntimeClassImpl(
    ptr: JNAPointer? = NULL
  ) : PointerType(ptr), WithDefault {
    public override val __1047768379_Ptr: JNAPointer?
      get() = pointer

    public override val _1047768379_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __1449643190_Ptr: JNAPointer? by lazy { 
      val refiid =
          com.sun.jna.platform.win32.Guid.REFIID(guidOf<IIterable<IWwwFormUrlDecoderEntry?>>())
      val result = PointerByReference()
      IUnknownVtbl(_1047768379_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public override val __970637876_Ptr: JNAPointer? by lazy { 
      val refiid =
          com.sun.jna.platform.win32.Guid.REFIID(guidOf<IVectorView<IWwwFormUrlDecoderEntry?>>())
      val result = PointerByReference()
      IUnknownVtbl(_1047768379_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun invoke(ptr: JNAPointer?): IWwwFormUrlDecoderRuntimeClass =
          IWwwFormUrlDecoderRuntimeClassImpl(ptr)
    }
  }

  public object ABI : IABI<IWwwFormUrlDecoderRuntimeClass, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun makeIWwwFormUrlDecoderRuntimeClass(ptr: JNAPointer?) =
        IWwwFormUrlDecoderRuntimeClassImpl( ptr)

    public override fun fromNative(segment: MemoryAddress): IWwwFormUrlDecoderRuntimeClass {
      val address = segment.toRawLongValue()
      return makeIWwwFormUrlDecoderRuntimeClass(Pointer(address))
    }

    public override fun toNative(obj: IWwwFormUrlDecoderRuntimeClass): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1047768379_Ptr))
  }
}
