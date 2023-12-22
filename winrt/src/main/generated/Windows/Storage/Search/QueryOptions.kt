package Windows.Storage.Search

import Windows.Foundation.Collections.IIterable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(QueryOptions.ABI::class)
@Signature("rc(Windows.Storage.Search.QueryOptions;{1e5e46ee-0f45-4838-a8e9-d0479d446c30})")
@WinRTByReference(brClass = QueryOptions.ByReference::class)
public class QueryOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IQueryOptions.WithDefault, IQueryOptionsWithProviderFilter.WithDefault,
    IWinRTObject {
  private val __605529529_Interface: IQueryOptions.WithDefault by lazy {
    as_605529529()
  }


  private val __541903672_Interface: IQueryOptionsWithProviderFilter.WithDefault by lazy {
    as_541903672()
  }


  public override val __605529529_Ptr: JNAPointer? by lazy {
    __605529529_Interface.__605529529_Ptr
  }


  public override val __541903672_Ptr: JNAPointer? by lazy {
    __541903672_Interface.__541903672_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__605529529_Interface, __541903672_Interface)

  public constructor() : this(ABI.activate())

  public constructor(query: CommonFileQuery, fileTypeFilter: IIterable<String?>) :
      this(ABI.activate(query, fileTypeFilter))

  public constructor(query: CommonFolderQuery) : this(ABI.activate(query))

  private fun as_605529529(): IQueryOptions.WithDefault {
    if(pointer == NULL) {
      return(IQueryOptions.ABI.makeIQueryOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IQueryOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IQueryOptions.ABI.makeIQueryOptions(ref.value))
  }

  private fun as_541903672(): IQueryOptionsWithProviderFilter.WithDefault {
    if(pointer == NULL) {
      return(IQueryOptionsWithProviderFilter.ABI.makeIQueryOptionsWithProviderFilter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IQueryOptionsWithProviderFilter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IQueryOptionsWithProviderFilter.ABI.makeIQueryOptionsWithProviderFilter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<QueryOptions> {
    public override fun getValue() = QueryOptions(pointer.getPointer(0))

    public fun setValue(value: QueryOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<QueryOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IQueryOptionsFactory_Instance: IQueryOptionsFactory by lazy {
      createIQueryOptionsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Storage.Search.QueryOptions".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIQueryOptionsFactory(): IQueryOptionsFactory {
      val refiid = Guid.REFIID(IQueryOptionsFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Search.QueryOptions".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IQueryOptionsFactory.ABI.makeIQueryOptionsFactory(factoryActivatorPtr.value))
    }

    public fun activate(query: CommonFileQuery, fileTypeFilter: IIterable<String?>): JNAPointer? =
        IQueryOptionsFactory_Instance.CreateCommonFileQuery(query, fileTypeFilter)?.pointer

    public fun activate(query: CommonFolderQuery): JNAPointer? =
        IQueryOptionsFactory_Instance.CreateCommonFolderQuery(query)?.pointer

    public override fun fromNative(segment: MemoryAddress): QueryOptions {
      val address = segment.toRawLongValue()
      return QueryOptions(Pointer(address))
    }

    public override fun toNative(obj: QueryOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
