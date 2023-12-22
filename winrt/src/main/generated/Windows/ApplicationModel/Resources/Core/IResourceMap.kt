package Windows.ApplicationModel.Resources.Core

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMapView
import Windows.Foundation.Uri
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
@ABIMarker(IResourceMap.ABI::class)
@Guid("72284824db8c42f8b08c53ff357dad82")
@WinRTByReference(IResourceMap.ByReference::class)
@TypeHash("__2021954409_Type")
public interface IResourceMap : NativeMapped, IWinRTInterface, IMapView<String?, NamedResource?>,
    IIterable<IKeyValuePair<String?, NamedResource?>?> {
  public val __2021954409_Ptr: Pointer?

  public val _2021954409_VtblPtr: Pointer?
    get() = __2021954409_Ptr?.getPointer(0)

  public override val __1676682589_Type: KType
    get() = IMapView::class.createType(listOf(
      KTypeProjection(INVARIANT,String::class.createType()),
      KTypeProjection(INVARIANT,NamedResource::class.createType()),
    ))

  public override val __1449643190_Type: KType
    get() = IIterable::class.createType(listOf(
      KTypeProjection(INVARIANT,IKeyValuePair::class.createType(listOf(
        KTypeProjection(INVARIANT,String::class.createType()),
        KTypeProjection(INVARIANT,NamedResource::class.createType()),
      ))),
    ))

  public fun get_Uri(): Uri?

  public fun GetValue(resource: String?): ResourceCandidate?

  public fun GetValue(resource: String?, context: ResourceContext?): ResourceCandidate?

  public fun GetSubtree(reference: String?): ResourceMap?

  public interface WithDefault : IResourceMap {
    public override fun get_Uri(): Uri? {
      val fnPtr = _2021954409_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__2021954409_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = Uri::class.createType()
      return marshalFromNative<Uri>(result.getValue(), returnType!!)
    }

    public override fun GetValue(resource: String?): ResourceCandidate? {
      val fnPtr = _2021954409_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<ResourceCandidate>()
      val hr = fn.invokeHR(arrayOf(__2021954409_Ptr,marshalToNative(resource),result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = ResourceCandidate::class.createType()
      return marshalFromNative<ResourceCandidate>(result.getValue(), returnType!!)
    }

    public override fun GetValue(resource: String?, context: ResourceContext?): ResourceCandidate? {
      val fnPtr = _2021954409_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<ResourceCandidate>()
      val hr = fn.invokeHR(arrayOf(__2021954409_Ptr,marshalToNative(resource),
          marshalToNative(context),result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = ResourceCandidate::class.createType()
      return marshalFromNative<ResourceCandidate>(result.getValue(), returnType!!)
    }

    public override fun GetSubtree(reference: String?): ResourceMap? {
      val fnPtr = _2021954409_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<ResourceMap>()
      val hr = fn.invokeHR(arrayOf(__2021954409_Ptr,marshalToNative(reference),result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = ResourceMap::class.createType()
      return marshalFromNative<ResourceMap>(result.getValue(), returnType!!)
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IResourceMap> {
    public override fun getValue(): IResourceMap = ABI.makeIResourceMap(pointer.getPointer(0))

    public fun setValue(value: IResourceMap): Unit {
      pointer = value.__2021954409_Ptr!!
    }
  }

  public class IResourceMapImpl(
    ptr: JNAPointer? = NULL
  ) : PointerType(ptr), WithDefault {
    public override val __2021954409_Ptr: JNAPointer?
      get() = pointer

    public override val _2021954409_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __1676682589_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IMapView<String?,
          NamedResource?>>())
      val result = PointerByReference()
      IUnknownVtbl(_2021954409_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public override val __1449643190_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IIterable<IKeyValuePair<String?,
          NamedResource?>?>>())
      val result = PointerByReference()
      IUnknownVtbl(_2021954409_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun invoke(ptr: JNAPointer?): IResourceMap = IResourceMapImpl(ptr)
    }
  }

  public object ABI : IABI<IResourceMap, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceMap(ptr: JNAPointer?) = IResourceMapImpl( ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceMap {
      val address = segment.toRawLongValue()
      return makeIResourceMap(Pointer(address))
    }

    public override fun toNative(obj: IResourceMap): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2021954409_Ptr))
  }
}
